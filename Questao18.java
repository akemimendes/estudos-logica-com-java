import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        double altura,peso;
        String sexo;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");

        System.out.println("***CÁLCULO DO PESO IDEAL II***");
        System.out.println("Informe a altura:");
        altura=entrada.nextDouble();
        System.out.println("Informe o sexo:");
        sexo=entrada.next();
        if (sexo.toUpperCase().contains("M")){
            peso=(72.7 * altura) - 58;
            System.out.println("O peso ideal é " + df.format(peso));
        }else if (sexo.toUpperCase().contains("F")){
            peso=(72.7 * altura) - 44.7f;
            System.out.println("O peso ideal é " + df.format(peso));
        }else{
            System.out.println("Informe um sexo válido (M - F)");
        }
       
        
    }
}
