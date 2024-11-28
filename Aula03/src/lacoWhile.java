import java.util.Scanner;

public class lacoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, soma =0, cont = 1;

        while (cont <=7) {
            System.out.print("Digite o " + cont +  "º numero:");
            numero = entrada.nextInt();
            soma = soma + numero;
            cont++;
        }
        System.out.println("A soma é: " + soma);
    }
}
