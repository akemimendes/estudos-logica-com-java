import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao29{
    public static void main(String[] args) {
        double valor,prestacao;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE PRESTAÇÃO***");
        System.out.println("Informe o valor da compra:");
        valor = entrada.nextDouble();
        System.out.println("O valor das prestações em 5x é R$ " + df.format(valor/5));
    }

}