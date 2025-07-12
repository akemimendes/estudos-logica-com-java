
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao27 {

    public static void main(String[] args) {
        double valorDolar,qtdDolar;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CONVERSÃO DE UNIDADES - MOEDAS***");
        System.out.println("Informe a cotação atual do dólar:");
        valorDolar = entrada.nextDouble();
        System.out.println("Informe a quantidade de dólar disponível:");
        qtdDolar = entrada.nextDouble();

        System.out.println("O valor convertido para real é R$ " + df.format(qtdDolar * valorDolar));

    }
}
