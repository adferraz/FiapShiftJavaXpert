import java.util.Scanner;

public class DesvioSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade do jogador: ");
        idade = leitor.nextInt();

        if (idade >= 12){
            System.out.println("Sua idade é: " + idade + " Você pode jogar");
        }else
            System.out.println("Sua idade é: " + idade + " Você NÃO pode jogar");

        leitor.close();
    }
}
