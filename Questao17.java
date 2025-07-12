import java.util.Scanner;

public class Questao17 {
     public static void main(String[] args) {
        float altura,peso;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DO PESO IDEAL I***");
        System.out.println("Informe a altura:");
        altura=entrada.nextFloat();
        peso=(72.7f * altura) - 58;
        System.out.println("O peso ideal é " + peso);
    }
}
