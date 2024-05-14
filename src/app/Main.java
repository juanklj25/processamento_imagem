package app;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        BufferedImage imagem = ManipularImagem.abrirImagem("menino.png");
        double kernel[] ={0.0625,0.125,0.0625,0.125,0,25,0.125,0.0625,0.125,0.0625};
        int kernel_horizontal[] ={-1,-2,-1,0,0,0,1,2,1};
//        int kernel_vertical[] ={-1,0,1,-2,,-0,2,-1,0,1};
//        int kernel_linhasOeste[] ={1,,1,-1,1,-2,1,1,1,-1};
//        int kernel_laplaciano[] ={0,-1,0,-1,4,-1,0,-1,0};
        ManipularImagem.exibirImagem(
             OperacoesPontuais.banda(imagem),
//             OperacoesPontuais.bandaRed(imagem),
//             OperacoesPontuais.bandaGreen(imagem),
//             OperacoesPontuais.bandaBlue(imagem),
//             OperacoesPontuais.negativo(imagem),
//             OperacoesPontuais.cinzaMedia(imagem),
//             OperacoesPontuais.cinzaRed(imagem),
//             OperacoesPontuais.cinzaBlue(imagem),
//             OperacoesPontuais.cinzaGreen(imagem),
//             OperacoesPontuais.binario(imagem,10),
//             OperacoesPontuais.alteraTonalidade(imagem,"blue",100),
//             OperacoesPontuais.brilhoMultiplicativo(imagem,100),
//             OperacoesPontuais.brilhoAditivo(imagem,100),
//             OperacoesPontuais.RGB_YIQ_N(imagem),
//             OperacoesPontuais.RGB_YIQ_brilho_add(imagem,100),
//             OperacoesPontuais.RGB_YIQ_brilho_mutipicativo(imagem,100),
               OperacoesLocais.convolucao(imagem,kernel),
               OperacoesLocais.Mediana(imagem,3)
        );
    }


}