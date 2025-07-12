import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao33 {
    public static void main(String[] args) {
        double custoProduto, valorProduto;

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE CUSTO DE UM PRODUTO II***");
        System.out.println("Informe o custo de fábrica do veículo:");
        custoProduto = entrada.nextDouble();      
        valorProduto = custoProduto + (custoProduto * 0.45);
        valorProduto = valorProduto + (valorProduto * 0.28);
        System.out.println("Valor de venda do veículo R$" + df.format(valorProduto));
    }
}
