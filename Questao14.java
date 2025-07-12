import java.util.Scanner;

public class Questao14 {
     public static void main(String[] args) {
        int volume,aresta;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DO VOLUME DE UM CUBO***");
        System.out.println("Informe o comprimento da aresta do cubo:");
        aresta=entrada.nextInt();
        volume = aresta * aresta * aresta;
        System.out.println("O volume do cubo é " + volume);
    }
}
