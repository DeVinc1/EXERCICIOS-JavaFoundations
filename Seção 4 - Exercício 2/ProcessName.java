/*
Você deve implementar o seguinte:
    1. Faça com que o usuário insira um nome.
    2. Extraia o primeiro e o último nomes do nome inserido pelo usuário. 
    3. Use os métodos de classe String para manipular name, conforme especificado:
    4. Exiba o nome do console.
*/

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome e sobrenome: ");
        String nomeCompleto = input.nextLine();

        input.close();

        /* Manipulação da String */
        String[] nomesSeparados = nomeCompleto.split(" ");
        
        String primeiroNome = nomesSeparados[0];
        String segundoNome = nomesSeparados[1];
        
        System.out.println("Seu nome é " + segundoNome.charAt(0) + ". " + primeiroNome);

    }
}
