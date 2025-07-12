import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int numero1,numero2,soma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("***SOMA DE DOIS NÚMEROS***");
        System.out.println("Informe o primeiro número");
        numero1=entrada.nextInt();
        System.out.println("Informe o segundo número");
        numero2=entrada.nextInt();
        soma=numero1+numero2;
        System.out.println("A soma do número " + numero1 + " + " + numero2 + " é " + soma);
    }
}
