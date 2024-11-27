import java.util.Scanner;

public class Doacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valorDolar, valorReal, taxaConversao = 5.82;

        System.out.print("Digite o valor em ($) Dolar da doação: $");
        valorDolar = leitor.nextDouble();

        valorReal = valorDolar * taxaConversao;

        System.out.println("O valor da doação convertido em (R$) Reais é: R$" + valorReal);
    }
}
