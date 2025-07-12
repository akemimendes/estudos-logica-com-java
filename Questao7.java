import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int lado,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("****PROGRAMA DOBRO DA ÁREA QUADRADO****");
        System.out.println("Informe o comprimento de um dos lados do quadrado:");
        lado=entrada.nextInt();
        area= lado * lado;
        System.out.println("O dobro da área do quadrado é " + area * 2);
    }
}
