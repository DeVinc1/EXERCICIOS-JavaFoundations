/* 
O comportamento normal de um sinal de trânsito é alternar sucessivamente de Vermelho para Verde para Amarelo para Vermelho (e continuar nesse padrão). 
Crie o programa java TrafficLightChecker.java que determinará a próxima cor de um sinal de trânsito neste padrão: de Vermelho para Verde para Amarelo para Vermelho, com base no sinal de trânsito atual fornecido pelo usuário.
 */

import java.util.Scanner;

public class trafficLightChecker {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código da cor do semáforo (1 - vermelho; 2 - Verde; 3 - Amarelo):");
        int corSemaforo = input.nextInt();

        input.close();

        if(corSemaforo == 1){
            System.out.println("A próxima cor será verde.");
        }
        else if(corSemaforo == 2){
            System.out.println("A próxima cor será amarela.");
        }
        else if(corSemaforo == 3){
            System.out.println("A próxima cor será vermelho.");
        }
        else{
            System.out.println("O código de cor é inválido.");
        }
    }
}
