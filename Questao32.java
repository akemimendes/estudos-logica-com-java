
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao32 {

    public static void main(String[] args) {
        double custoProduto, valorProduto, acrescimo;

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE CUSTO DE UM PRODUTO I***");
        System.out.println("Informe o custo do produto:");
        custoProduto = entrada.nextDouble();
        System.out.println("Informe o percentual de acréscimo:");
        acrescimo = entrada.nextDouble();
        valorProduto = custoProduto + ((custoProduto * acrescimo) / 100);
        System.out.println("Valor de venda do produto R$" + df.format(valorProduto));
    }
}
