
import java.util.Scanner;

public class Questao31 {

    public static void main(String[] args) {
        int anos, meses, dias, totalDias;
       
        Scanner entrada = new Scanner(System.in);

        System.out.println("***CONVERSÃO DE UNIDADES -  TEMPO***");
        System.out.println("Informe a idade expressa em anos, meses e dias->>");
        System.out.println("Informe quantidade de anos:");
        anos = entrada.nextInt();
        System.out.println("Informe quantidade de meses:");
        meses = entrada.nextInt();
        System.out.println("Informe quantidade de dias:");
        dias = entrada.nextInt();
        totalDias= anos * 365;
        totalDias= totalDias + (meses * 30);
        totalDias= totalDias + dias;
               
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias.");
        System.out.println("convertido para dias: " + totalDias);
    }
}
