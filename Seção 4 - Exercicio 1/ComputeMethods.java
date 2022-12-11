/*  
Escreva um arquivo java, ComputeMethods.java, e defina os três métodos a seguir:
        -public double fToC(double degreesF)
        -public double hypotenuse(int a, int b)
        -public int roll()
*/

import java.util.Random;

public class ComputeMethods {
    
    public double fToC (double degreeF){
        return 5.0/9.0 * (degreeF-32);
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public int roll(){
        Random rnd = new Random();
        return (rnd.nextInt(6) + 1) + (rnd.nextInt(6) + 1);
    }
}
