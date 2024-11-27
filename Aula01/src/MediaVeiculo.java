import java.util.Scanner;

public class MediaVeiculo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int kmInicial, kmFinal;
        double litrosAbastecidos, mediaKm;

        System.out.print("Digite o KM INICIAL: ");
        kmInicial = leitor.nextInt();

        System.out.print("Digite o KM FINAL: ");
        kmFinal = leitor.nextInt();

        System.out.print("Entre com a quantidade de LITROS ABASTECIDOS: ");
        litrosAbastecidos = leitor.nextDouble();

        mediaKm = (double) (kmFinal - kmInicial) / litrosAbastecidos;

        System.out.println("O carro faz " + mediaKm + " km por litro ");
    }
}
