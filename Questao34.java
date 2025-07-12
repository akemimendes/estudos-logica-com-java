

import java.util.Scanner;

public class Questao34 {

    public static void main(String[] args) {
        int centenas, dezenas, unidades, numero;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***CENTENAS, DEZENAS E UNIDADES***");
        System.out.println("Informe um número menor que 1000:");
        numero = entrada.nextInt();
        centenas = numero / 100;
        dezenas = (numero - (centenas * 100))/10;
        unidades = numero - ((centenas*100) + (dezenas * 10));
        System.out.println("Centena = " + centenas + ", Dezena = " + dezenas + " e Unidade = " + unidades);
    }
}
