import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        double quilo,libra;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CONVERSOR DE UNIDADE - PESO***");
        System.out.println("Informe o quilograma KG:");
        quilo=entrada.nextDouble();
        libra=quilo * 2.20462;
        System.out.println("O valor "+ quilo +" KG, convertido para libra é " + libra);
    }
}
