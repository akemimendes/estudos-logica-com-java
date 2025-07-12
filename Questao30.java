
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao30 {

    public static void main(String[] args) {
        double salario, vendasMes;
        String nome;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE COMISSÃO SOBRE VENDAS***");
        System.out.println("Informe o nome:");
        nome = entrada.next();
        System.out.println("Informe o salário fixo:");
        salario = entrada.nextDouble();
        System.out.println("Informe o valor total de vendas no mês em R$:");
        vendasMes = entrada.nextDouble();
        System.out.println("Nome: " + nome + "\nSalário fixo: R$ " + df.format(salario) + "\nSalário no final do mês: R$ " + df.format((vendasMes * 0.15) + salario));
    }
}
