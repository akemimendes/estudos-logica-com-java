import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        double raio,volume;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("***CÁLCULO DO VOLUME DE UMA ESFERA***");
        System.out.println("Informe do raio da esfera:");
        raio=entrada.nextDouble();
        volume = (4 / 3 ) * 3.14 * raio * raio * raio; 
        System.out.println("O volume da esfera é " + volume);
    }
}
