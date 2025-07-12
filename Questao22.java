
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao22 {

    public static void main(String[] args) {

        double metro, lata18lSemDesper, lata3lSemDesper, lata18l, lata3l, litro, litroSemDesper;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***QUANTIDADE DE LATAS DE TINTAS II***");
        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada:");
        metro = entrada.nextDouble();
        litro = metro / 6;

        lata3l = litro / 3.6;
        lata18l = litro / 18;

        lata3l = Math.ceil(lata3l);
        lata18l = Math.ceil(lata18l);

        //calcular sem desperdicio
        litroSemDesper = litro + (litro * 0.10);

        if (metro <= 6 || litroSemDesper <= 18) {
            lata18lSemDesper = 0;
            lata3lSemDesper = 1;
        } else {
            lata18lSemDesper = litroSemDesper / 18;
            lata3lSemDesper = 0;
            if (litroSemDesper < 18) {
                lata18lSemDesper = 0;
                lata3lSemDesper = litroSemDesper / 3.6;
            } else {
                if (litroSemDesper % 18 >= 0) {
                    double resto = litroSemDesper % 18;
                    lata3lSemDesper = resto / 3.6;
                }
            }
        }

        if (lata3lSemDesper > 0) {
            lata3lSemDesper = Math.ceil(lata3lSemDesper);
        }
        System.out.println(
                "Quantidades de lata(s) a ser compradas de 18l: " + (int)lata18l + " com valor total de R$ " + df.format(lata18l * 80));
        System.out.println(
                "Quantidades de lata(s) a ser compradas de 3.6l: " + (int)lata3l + " com valor total de R$ " + df.format(lata3l * 25));
        System.out.println(
                "Quantidades de lata(s) a ser compradas sem desperdício e acrescentado 10% de folga:\n latas de 18l: " + (int)lata18lSemDesper + " \n latas de 3.6l: " + (int)lata3lSemDesper + " \n valor total de R$ " + df.format((lata18lSemDesper * 80) + (lata3lSemDesper * 25)));

    }
}
