
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        double valorHora, salario, horasTrab;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE SÁLARIO***");
        System.out.println("Informe o valor ganho por hora:");
        valorHora = entrada.nextDouble();
        System.out.println("Informe o quantidade de horas trabalhadas no mês:");
        horasTrab = entrada.nextDouble();
        salario = valorHora * horasTrab;
        System.out.println("O valor total do salário por mês é " + df.format(salario));
    }
}
