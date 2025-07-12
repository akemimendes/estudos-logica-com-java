import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        double valorHora,salarioBruto,inss,sindicato,impostoRenda,salarioLiquido;
        int horasTrab;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DE SÁLARIO E DESCONTO***");
        System.out.println("Informe o valor ganho por hora:");
        valorHora=entrada.nextDouble();
        System.out.println("Informe o quantidade de horas trabalhadas no mês:");
        horasTrab=entrada.nextInt();
        salarioBruto= valorHora * horasTrab;
        inss=  salarioBruto * 0.08;
        sindicato=  salarioBruto * 0.05;
        impostoRenda=  salarioBruto * 0.11;
        salarioLiquido= salarioBruto - (inss+sindicato+impostoRenda);
        System.out.println("O valor do salário bruto é R$" + df.format(salarioBruto));  
        System.out.println("Valor pago ao INSS é R$" + df.format(inss)); 
        System.out.println("Valor pago ao sindicato é R$" + df.format(sindicato)); 
        System.out.println("O valor do salário líquido é R$" + df.format(salarioLiquido));    
    }
}
