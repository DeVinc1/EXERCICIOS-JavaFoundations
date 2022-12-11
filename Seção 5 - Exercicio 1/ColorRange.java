/* Crie o programa Java interativo ColorRange.java. Quando determinado comprimento de onda em nanômetros for fornecido, ele retornará a cor correspondente no espectro visível. */

import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento de onda da cor: ");
        double comprimentoDeOnda = input.nextDouble();

        input.close();

        if(comprimentoDeOnda < 380 || comprimentoDeOnda > 749){
            System.out.println("O comprimento de onda está fora do espectro visível");
        }
        else if(comprimentoDeOnda >= 380 && comprimentoDeOnda < 450){
            System.out.println("A cor é " + "Violeta");
        }
        else if(comprimentoDeOnda >= 450 && comprimentoDeOnda < 495){
            System.out.println("A cor é " + "Azul");
        }
        else if(comprimentoDeOnda >= 495 && comprimentoDeOnda < 570){
            System.out.println("A cor é " + "Verde");
        }
        else if(comprimentoDeOnda >= 570 && comprimentoDeOnda < 590){
            System.out.println("A cor é " + "Amarelo");
        }
        else if(comprimentoDeOnda >= 590 && comprimentoDeOnda < 620){
            System.out.println("A cor é " + "Laranja");
        }
        else if(comprimentoDeOnda >= 620 && comprimentoDeOnda < 750){
            System.out.println("A cor é " + "Vermelho");
        }

    }
}
