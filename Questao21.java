
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao21 {

    public static void main(String[] args) {
        double lata, valor, metro, litro;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***QUANTIDADE DE LATAS DE TINTAS I***");
        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada:");
        metro = entrada.nextDouble();
        litro = metro / 3;
        lata = litro / 18;
        lata = Math.ceil(lata);
        valor = lata * 80;
        System.out.println(
                "Quantidades de lata(s) a ser compradas: " + lata + " com valor total de R$ " + df.format(valor));
    }
}
