import java.util.Scanner;

public class Questao15 {
     public static void main(String[] args) {
        double volume,raio,altura;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DO VOLUME DE UM CONE***");
        System.out.println("Informe o raio da base do cone:");
        raio=entrada.nextDouble();
        System.out.println("Informe a altura do cone:");
        altura=entrada.nextDouble();
        volume = 1/3 * 3.14 * (raio * raio) * altura;
        System.out.println("O volume do cone é " + volume);
    }
}
