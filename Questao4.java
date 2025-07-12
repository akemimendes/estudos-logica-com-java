
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int nota1,nota2,nota3,nota4,media;
        Scanner entrada=new Scanner(System.in);
        System.out.println("***MÉDIA DE NOTAS BIMESTRAIS***");
        System.out.println("Informe a primeira nota:");
        nota1=entrada.nextInt();
        System.out.println("Informe a segunda nota:");
        nota2=entrada.nextInt();
        System.out.println("Informe a terceira nota:");
        nota3=entrada.nextInt();
        System.out.println("Informe a quarta nota:");
        nota4=entrada.nextInt();
        media=(nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das notas do bimestre é " + media);

    }
}
