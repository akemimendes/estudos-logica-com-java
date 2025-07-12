import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao28{
    public static void main(String[] args) {
        double valor;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE RENDIMENTOS***");
        System.out.println("Informe o valor depositado:");
        valor = entrada.nextDouble();
        System.out.println("O valor com rendimentos é R$ " + df.format(valor + (valor * 0.50)));
    
    }
}