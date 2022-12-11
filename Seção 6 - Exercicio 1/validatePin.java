/* Desenvolva um programa Java para validar um PIN bancário de um cliente. Use um loop while para repetir o código até que um PIN válido seja inserido. */

import java.util.Scanner;

public class validatePin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pin = 638932;

        System.out.print("Insira o pin de 6 dígitos: ");
        int pinInserido = input.nextInt();

        while (pinInserido != pin){
            System.out.print("O pin inserido é incorreto, tente novamente: ");
            pinInserido = input.nextInt();
        }

        input.close();
        System.out.println("O pin inserido é válido.");
    }
}
