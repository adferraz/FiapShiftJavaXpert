import java.util.Scanner;

public class DesvioEncadeado {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.print("Digite a idade: ");
        idade = leitor.nextInt();

        if (idade <= 16){
            System.out.println("Passageiro não pode votar e nem embarcar");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println("Voto e embarque opcional ");
        } else {
            System.out.println("Voto e embarque obrigatórios");
        }

        leitor.close();
    }
}
