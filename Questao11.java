import java.util.Scanner;

public class Questao11 {
     public static void main(String[] args) {
        int area,base,altura;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DA ÁREA DE UM TRIÂNGULO***");
        System.out.println("Informe a base do triângulo:");
        base=entrada.nextInt();
        System.out.println("Informe a altura do triângulo:");
        altura=entrada.nextInt();
        area = (base * altura) / 2;
        System.out.println("A área do triângulo é " + area);
    }
}
