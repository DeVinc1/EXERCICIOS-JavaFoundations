/* Desenvolva um programa java para calcular os múltiplos de determinado número usando um loop for. */
import java.util.Scanner;

public class displayMultiples {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = input.nextInt();

        input.close();

        System.out.println("Os múltiplos desse número são");
        for(int i=1; i < 13; i++){
            System.out.println(num + "x" + i + " = " + (num * i)); 
        }
   } 
}
