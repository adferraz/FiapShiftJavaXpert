import java.util.Scanner;

public class Calculadora {
    public static double resultado;

    public static void exibirMenu(){
        System.out.println("PROGRAMA CALCULADORA");
        System.out.println("Escolha um aopção");
        System.out.println("1 - Digitar valores");
        System.out.println("2 - Realizar soma");
        System.out.println("3 - Realizar subtração");
        System.out.println("4 - Realizar divisão");
        System.out.println("5 - Realizar multiplicação");
        System.out.println("6 - Sair");

    }

    public static void exibirResultado(double resultado){
        System.out.println("O resultado foi " + resultado + "!");
    }

    public static void somar (double primeiroValor, double segundoValor){
        double soma;
        System.out.println("\n\nRealizando a soma entre " + primeiroValor + " e " + segundoValor);
        soma = primeiroValor + segundoValor;
        exibirResultado(soma);
    }

    public static void subtrair (double primeiroValor, double segundoValor){
        double soma;
        System.out.println("\n\nRealizando a subtração entre " + primeiroValor + " e " + segundoValor);
        soma = primeiroValor - segundoValor;
        exibirResultado(soma);
    }

    public static void multiplicar (double primeiroValor, double segundoValor){
        double soma;
        System.out.println("\n\nRealizando a multiplicação entre " + primeiroValor + " e " + segundoValor);
        soma = primeiroValor * segundoValor;
        exibirResultado(soma);
    }

    public static void dividir (double primeiroValor, double segundoValor){
        double soma;
        System.out.println("\n\nRealizando a divisão entre " + primeiroValor + " e " + segundoValor);
        soma = primeiroValor / segundoValor;
        exibirResultado(soma);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valor01 = 0, valor02 = 0;
        //double soma, subtracao, divisao, multiplicacao, total;
        int opcao = 0;

        while (opcao != 6){
            exibirMenu();
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n\nDigite o 1º valor");
                    valor01 = leitor.nextDouble();
                    System.out.println("\n\nDigite o 2º valor");
                    valor02 = leitor.nextDouble();
                    System.out.println("Os valores " + valor01 + " e " + valor02 + "foram amarzenados\n\n");
                    break;

                case 2:
                    somar(valor01, valor02);
                    break;

                case 3:
                    subtrair(valor01, valor01);
                    break;

                case 4:
                    multiplicar(valor01, valor02);
                    break;

                case 5:
                    dividir(valor01, valor02);
                    break;

                case 6:
                    System.out.println("Finalizando sistema");
                    break;

            }
        }
    }
}
