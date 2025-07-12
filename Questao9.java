import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int celsius,fahrenheit;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CONVERSÃO DE UNIDADES - TEMPERATURA***");
        System.out.println("Informe o valor em fahrenheit:");
        fahrenheit=entrada.nextInt();
        celsius= 5 * ((fahrenheit-32)/9);
        System.out.println("O valor convertido para Celsius é " + celsius + " C°");
    }
}
