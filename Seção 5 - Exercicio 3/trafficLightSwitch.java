/* Repita o exercício 2 usando a instrução switch. */

import java.util.Scanner;

public class trafficLightSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código da cor do semáforo (1 - vermelho; 2 - Verde; 3 - Amarelo):");
        int corSemaforo = input.nextInt();

        input.close();
        switch (corSemaforo) {
            case 1:
                System.out.println("A próxima cor será verde.");
                break;
            case 2:
                System.out.println("A próxima cor será amarela.");
                break;
            case 3:
                System.out.println("A próxima cor será vermelho.");
                break;
            default:
                System.out.println("O código de cor é inválido.");
                break;
        }
    }
}
