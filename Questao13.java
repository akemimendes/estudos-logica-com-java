import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        int area,largura,altura;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DA ÁREA DE UM RETÂNGULO***");
        System.out.println("Informe a largura do retângulo:");
        largura=entrada.nextInt();
        System.out.println("Informe a altura do retângulo:");
        altura=entrada.nextInt();
        area = largura * altura;
        System.out.println("A área do retângulo é " + area);
    }
}
