package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class OperacoesPontuais {
    public static BufferedImage bandaRed(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(0, 0, 0);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaGreen(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(0, green, 0);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage banda(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage bandaBlue(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(0, 0, blue);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage negativo(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(255 - red, 255 - green, 255 - blue);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaMedia(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                Color novarcor = new Color(media, media, media);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaRed(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(red, red, red);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaBlue(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(blue, blue, blue);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage cinzaGreen(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                Color novarcor = new Color(green, green, green);
                imgSaida.setRGB(w, h, novarcor.getRGB());
            }
        }
        return imgSaida;
    }

    public static BufferedImage binario(BufferedImage imagem, int lin) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int media = (red + green + blue) / 3;
                if (media > lin) {
                    Color novarcor = new Color(0, 0, 0);
                    imgSaida.setRGB(w, h, novarcor.getRGB());
                } else {
                    Color novarcor = new Color(255, 255, 255);
                    imgSaida.setRGB(w, h, novarcor.getRGB());
                }

            }
        }
        return imgSaida;
    }

    public static BufferedImage alteraTonalidade(BufferedImage imgEntrada, String banda, int valor) {
        boolean isRed = banda.equalsIgnoreCase("red");
        boolean isGreen = banda.equalsIgnoreCase("green");
        boolean isBlue = banda.equalsIgnoreCase("blue");
        if (!isRed && !isGreen && !isBlue) {
            throw new IllegalArgumentException("Banda inválida");
        } else {
            int largura = imgEntrada.getWidth();
            int altura = imgEntrada.getHeight();
            BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

            for (int h = 0; h < altura; ++h) {
                for (int w = 0; w < largura; ++w) {
                    int rgb = imgEntrada.getRGB(w, h);
                    Color cor = new Color(rgb);
                    int red = cor.getRed();
                    int green = cor.getRed();
                    int blue = cor.getBlue();
                    if (banda.equalsIgnoreCase("red")) {
                        red = validaLimiteRGB(red, valor);
                    }

                    if (banda.equalsIgnoreCase("green")) {
                        green = validaLimiteRGB(green, valor);
                    }

                    if (banda.equalsIgnoreCase("blue")) {
                        blue = validaLimiteRGB(blue, valor);
                    }

                    cor = new Color(red, green, blue);
                    imgSaida.setRGB(w, h, cor.getRGB());
                }
            }

            return imgSaida;
        }
    }

    public static BufferedImage brilhoAditivo(BufferedImage imgEntrada, int valor) {
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; ++h) {
            for (int w = 0; w < largura; ++w) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                red = validaLimiteRGB(red, valor);
                green = validaLimiteRGB(green, valor);
                blue = validaLimiteRGB(blue, valor);
                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }

        return imgSaida;
    }

    public static BufferedImage brilhoMultiplicativo(BufferedImage imgEntrada, float valor) {
        int largura = imgEntrada.getWidth();
        int altura = imgEntrada.getHeight();
        BufferedImage imgSaida = new BufferedImage(largura, altura, imgEntrada.getType());

        for (int h = 0; h < altura; ++h) {
            for (int w = 0; w < largura; ++w) {
                int rgb = imgEntrada.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                red = validaLimiteRGB(red, valor);
                green = validaLimiteRGB(green, valor);
                blue = validaLimiteRGB(blue, valor);
                Color novaCor = new Color(red, green, blue);
                imgSaida.setRGB(w, h, novaCor.getRGB());
            }
        }

        return imgSaida;
    }

    public static BufferedImage RGB_YIQ_N(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.274 * green - 0.322 * blue);
                float Q = (float) (0.211 * red - 0.523 * green + 0.312 * blue);
                Y = 255 - Y;
                Y = validaLimiteYIQ(Y);
                I = validaLimiteYIQ(I);
                Q = validaLimiteYIQ(Q);
                red = (int) (1.000 * Y + 0.956 * I + 0.621 * Q);
                blue = (int) (1.000 * Y - 0.274 * I - 0.647 * Q);
                green = (int) (1.000 * Y - 1.106 * I - 1.703 * Q);
                red = validaLimiteRGBS(red);
                green = validaLimiteRGBS(green);
                blue = validaLimiteRGBS(blue);

                Color novarcor = new Color(red, green, blue);

                imgSaida.setRGB(w, h, novarcor.getRGB());


            }
        }
        return imgSaida;
    }

    public static BufferedImage RGB_YIQ_brilho_add(BufferedImage imagem, int lin) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.274 * green - 0.322 * blue);
                float Q = (float) (0.211 * red - 0.523 * green + 0.312 * blue);
                Y = Y + lin;
                Y = validaLimiteYIQ_A(Y, lin);
                red = (int) (1.000 * Y + 0.956 * I + 0.621 * Q);
                blue = (int) (1.000 * Y - 0.274 * I - 0.647 * Q);
                green = (int) (1.000 * Y - 1.106 * I - 1.703 * Q);
                red = validaLimiteRGBS(red);
                green = validaLimiteRGBS(green);
                blue = validaLimiteRGBS(blue);

                Color novarcor = new Color(red, green, blue);

                imgSaida.setRGB(w, h, novarcor.getRGB());


            }
        }
        return imgSaida;
    }

    public static BufferedImage RGB_YIQ_brilho_mutipicativo(BufferedImage imagem, int lin) {


        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        BufferedImage imgSaida = new BufferedImage(largura, altura, imagem.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = imagem.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.274 * green - 0.322 * blue);
                float Q = (float) (0.211 * red - 0.523 * green + 0.312 * blue);
                Y = Y * lin;
                Y = validaLimiteYIQ_A(Y, lin);
                red = (int) (1.000 * Y + 0.956 * I + 0.621 * Q);
                blue = (int) (1.000 * Y + 0.274 * I + 0.647 * Q);
                green = (int) (1.000 * Y + 1.106 * I + 1.703 * Q);
                red = validaLimiteRGBS(red);
                green = validaLimiteRGBS(green);
                blue = validaLimiteRGBS(blue);

                Color novarcor = new Color(red, green, blue);

                imgSaida.setRGB(w, h, novarcor.getRGB());


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
}

