import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        double multa,peso,excesso;
                
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("***MULTA SOBRE O EXCESSO***");
        System.out.println("Informe o peso do peixe(kg):");
        peso=entrada.nextDouble();
        if (peso>50){
            excesso=peso-50;
            multa= excesso * 4;
            System.out.println("O peso do peixe excedeu o limite em " + excesso + "kg , o valor da multa é RS " + df.format(multa));
        }else{
            System.out.println("O peso do peixe não excedeu o limite");
        }       
    }
}
