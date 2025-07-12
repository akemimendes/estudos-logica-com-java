import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao25{
    public static void main(String[] args) {
        int numero1,numero2;
        float numero3;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("***CALCULADORA II***");
        System.out.println("Informe o primeiro número inteiro:");
        numero1 = entrada.nextInt();
        System.out.println("Informe o segundo número inteiro:");
        numero2 = entrada.nextInt();
        System.out.println("Informe o terceiro número com casas decimais:");
        numero3 = entrada.nextFloat();


        System.out.println("O produto do dobro de " + numero1 + " com metade de " + numero2 + " = " + ((numero1*2)*(numero2/2)));
        System.out.println("A soma do triplo de " + numero1 + " com " + numero3 + " = " + ((numero1 * 3) + numero3));
        System.out.println("O terceiro numero " + numero3 + " elevado ao cubo: " +(numero3 * numero3 * numero3));
        
    }
}