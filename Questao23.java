import java.util.Scanner;

public class Questao23{
    public static void main(String[] args) {
        int tamanhoArquivo, velocidadeInternet, tempoDownload, tempoMin, tempoSeg;
        Scanner entrada = new Scanner(System.in);

        System.out.println("***TEMPO DE DOWNLOAD***");
        System.out.println("Informe o tamanho do arquivo em MB para download:");
        tamanhoArquivo = entrada.nextInt();
        System.out.println("Informe a velocidade em Mbps da internet:");
        velocidadeInternet = entrada.nextInt();
        tempoDownload = tamanhoArquivo/velocidadeInternet;
        tempoMin = tempoDownload / 60;
        tempoSeg = tempoDownload % 60;
        System.out.println("O tempo de para realizar o download do arquivo é: " + tempoMin + " minutos e " + tempoSeg + " segundos");
    }
}