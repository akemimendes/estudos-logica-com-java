import java.util.Scanner;

public class Questao6 {
     public static void main(String[] args) {
        double raio,area;
        Scanner entrada=new Scanner(System.in);
        System.out.println("***ÁREA DE UM CÍRCULO***");
        System.out.println("Informe o raio do círculo:");
        raio=entrada.nextDouble();
        area=(2 * 3.14) * (raio * raio);
        System.out.println("A aréa do círculo é " + area);
    }
}
