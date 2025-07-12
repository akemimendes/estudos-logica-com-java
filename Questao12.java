import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        double volume,raio,altura;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DO VOLUME DE UM CILINDRO***");
        System.out.println("Informe o raio da base do cilindro:");
        raio=entrada.nextDouble();
        System.out.println("Informe a altura do cilindro:");
        altura=entrada.nextDouble();
        volume = 3.14 * raio * raio * altura;
        System.out.println("O volume do cilindro é " + volume);
    }
}
