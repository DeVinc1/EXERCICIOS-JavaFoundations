/* Escreva um segundo arquivo java, TestClass.java, e execute o seguinte:
    Adicione um método main;
    Crie uma instância de ComputeMethods, chame os métodos definidos em ComputeMethods.java nesta instância.
 */

public class TestClass {
    public static void main(String[] args) {

        ComputeMethods calcular = new ComputeMethods();
        double temperaturaFahrenheit = 100.4;
        int ladoA_triangulo = 6;
        int ladoB_triangulo = 8;

        System.out.println("A temperatura " + temperaturaFahrenheit + "ºF é igual a: " + calcular.fToC(temperaturaFahrenheit));
        System.out.println("A hipotenusa é: " + calcular.hypotenuse(ladoA_triangulo, ladoB_triangulo));
        System.out.println("A soma dos dados é: " + calcular.roll());
    }    
}
