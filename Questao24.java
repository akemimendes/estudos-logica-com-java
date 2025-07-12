import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao24{
    public static void main(String[] args) {
        double numero1,numero2;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("***CALCULADORA I***");
        System.out.println("Informe o primeiro número:");
        numero1 = entrada.nextDouble();
        System.out.println("Informe o segundo número:");
        numero2 = entrada.nextDouble();

        System.out.println("Resultado da soma dos números " + numero1 + " + " + numero2 + " = " + df.format((numero1 + numero2)));
        System.out.println("Resultado da subtração dos números " + numero1 + " - " + numero2 + " = " + df.format((numero1 - numero2)));
        System.out.println("Resultado da multiplicação dos números " + numero1 + " x " + numero2 + " = " + df.format((numero1 * numero2)));
        System.out.println("Resultado da divisão dos números " + numero1 + " / " + numero2 + " = " + df.format((numero1 / numero2)));
    }
}