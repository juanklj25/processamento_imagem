package app;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Arrays;

public class OperacoesLocais{
    public static BufferedImage Mediana(BufferedImage img,int tamanho) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imgFiltrada = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        int central = tamanho /2;

        for (int i = central; i < altura - central; i++) {
            for (int j = central; j < largura - central; j++) {
                int[] listaPixelsRed = new int[tamanho * tamanho];
                int[] listaPixelsGreen = new int[tamanho * tamanho];
                int[] listaPixelsBlue = new int[tamanho * tamanho];
                int indice = 0;
                for (int k = -central; k <= central; k++) {
                    for (int l = -central; l <= central; l++) {
                        Color cor = new Color(img.getRGB(j + l, i + k));
                        listaPixelsRed[indice] = cor.getRed();
                        listaPixelsGreen[indice] = cor.getGreen();
                        listaPixelsBlue[indice] = cor.getBlue();
                        indice++;
                    }
                }
                Arrays.sort(listaPixelsRed);
                Arrays.sort(listaPixelsGreen);
                Arrays.sort(listaPixelsBlue);
                int medianaRed = listaPixelsRed[(tamanho*tamanho/2)];
                int medianaGreen = listaPixelsGreen[(tamanho*tamanho/2)];
                int medianaBlue = listaPixelsBlue[(tamanho*tamanho/2)];
                Color corMediana = new Color(medianaRed, medianaGreen, medianaBlue);
                imgFiltrada.setRGB(j, i, corMediana.getRGB());
            }
        }

        return imgFiltrada;
    }

    public static BufferedImage Media(BufferedImage img,int tamanho) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imgFiltrada = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        int central = tamanho /2;

        for (int i = central; i < altura - central; i++) {
            for (int j = central; j < largura - central; j++) {
                int listaPixelsRed =0;
                int listaPixelsGreen =0;
                int listaPixelsBlue =0;
                for (int k = -central; k <= central; k++) {
                    for (int l = -central; l <= central; l++) {
                        Color cor = new Color(img.getRGB(j + l, i + k));
                        listaPixelsRed += cor.getRed();
                        listaPixelsGreen += cor.getGreen();
                        listaPixelsBlue += cor.getBlue();

                    }
                }

                int medianaRed = listaPixelsRed/ (tamanho*tamanho);
                int medianaGreen = listaPixelsGreen /(tamanho*tamanho);
                int medianaBlue = listaPixelsBlue/(tamanho*tamanho);
                Color corMediana = new Color(medianaRed, medianaGreen, medianaBlue);
                imgFiltrada.setRGB(j, i, corMediana.getRGB());
            }
        }

        return imgFiltrada;
    }
    public static BufferedImage convolucao(BufferedImage imgEntrada, int[] kernel){
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++){
            for (int w = 0; w < largura; w++){
                if (ePixelDeBorda(h, w, altura, largura)){
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }
                int [] vizinhanca = obterVizinhanca(imgEntrada, w, h);
                int resultado = 0;
                for (int i = 0; i < 9; i++){
                    resultado += vizinhanca[i] * kernel[i];
                }

                Color novaCor = new Color (validaLimiteRGBS((int) resultado),validaLimiteRGBS((int) resultado), validaLimiteRGBS((int) resultado));
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }

        }
        return imgSaida;
    }
    public static BufferedImage convolucao(BufferedImage imgEntrada, double[] kernel){
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());
        for (int h = 0; h < altura; h++){
            for (int w = 0; w < largura; w++){
                if (ePixelDeBorda(h, w, altura, largura)){
                    int rgb = imgEntrada.getRGB(w, h);
                    imgSaida.setRGB(w, h, rgb);
                    continue;
                }
                int [] vizinhanca = obterVizinhanca(imgEntrada, w, h);
                double resultado = 0.0;
                for (int i = 0; i < 9; i++){
                    resultado += vizinhanca[i] * kernel[i];
                }

                Color novaCor = new Color (validaLimiteRGBS((int) resultado),validaLimiteRGBS((int) resultado), validaLimiteRGBS((int) resultado));
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }

        }
        return imgSaida;
    }


    private static int validaLimiteRGB(int banda, int acrescimo) {
        banda += acrescimo;
        if (banda > 255) {
            banda = 255;
        } else if (banda < 0) {
            banda = 0;
        }

        return banda;
    }

    private static int validaLimiteRGB(int banda, float acrescimo) {
        banda = (int)((float)banda * acrescimo);
        if (banda > 255) {
            banda = 255;
        } else if (banda < 0) {
            banda = 0;
        }

        return banda;
    }
    private static float validaLimiteYIQ(float banda) {
        if (banda > 255) {
            banda = 255;
        } else if (banda < 0) {
            banda = 0;
        }

        return banda;
    }
    private static int validaLimiteRGBS(int banda) {
        if (banda > 255) {
            banda = 255;
        } else if (banda < 0) {
            banda = 0;
        }

        return banda;
    }
    private static float validaLimiteYIQ_A(float banda, int lin) {
        banda = (banda * lin);
        if (banda > 255) {
            banda = 255;
        } else if (banda < 0) {
            banda = 0;
        }

        return banda;
    }
    private static boolean ePixelDeBorda(int h, int w, int altura, int largura) {
        return h == 0 || w == 0 || h == altura - 1 || w == largura -1;
    }
    private static int [] obterVizinhanca(BufferedImage imgEntrada, int w, int h){
        int [] vizinhanca = new int [9];
        int count = 0;
        for (int i = -1; i <= 1; i++){
            for (int j = -1; j <= 1; j++){
                int rgb = imgEntrada.getRGB(w + j, h + i);
                Color corVizinho = new Color(rgb);
                vizinhanca[count++] = corVizinho.getRed();
            }
        }
        return vizinhanca;
    }
}
