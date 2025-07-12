import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        int metro,centimetro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CONVERSÃO DE UNIDADES***");
        System.out.println("Informe o valor(metros) a ser convertido para centímetros:");
        metro=entrada.nextInt();
        centimetro=metro*100;
        System.out.println("O valor em metros (" + metro + ") convertido para centimetros é " + centimetro);
    }
}
