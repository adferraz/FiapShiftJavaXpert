import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero01;
        int numero02;
        int opcao;
        int resultado;

        System.out.print("Digite o primeiro número: ");
        numero01 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        numero02 = leitor.nextInt();

        System.out.print("Digite a opção: (1)Somar (2)Subtrair (3)Multiplicar (4)Dividir ");
        opcao = leitor.nextInt();

        if (opcao == 1) {
            resultado = numero01 + numero02;
            System.out.println("A SOMA dos números é: " + resultado);
        } else if (opcao ==2) {
            resultado = numero01 - numero02;
            System.out.println("A SUBTRAÇÃO dos números é: " + resultado);
        } else if (opcao == 3) {
            resultado = numero01 * numero02;
            System.out.println("A MULTIPLICAÇÃO dos números é: " + resultado);
        } else if (opcao ==4) {
             resultado = numero01 / numero02;
            System.out.println("A DIVISÃO dos números é: " + (double) resultado);
        } else
            System.out.println("Opção digitada inválida");

        leitor.close();
    }
}