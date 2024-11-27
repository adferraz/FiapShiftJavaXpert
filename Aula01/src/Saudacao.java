import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        System.out.print("Digite seu nome: ");
        nome = leitor.next();
        System.out.println("O nome digitado foi: " + nome);


        leitor.close();
    }
}
