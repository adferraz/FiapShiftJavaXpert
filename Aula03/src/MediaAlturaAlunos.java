import java.util.Scanner;

public class MediaAlturaAlunos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double media, somaAlturas = 0.0;
        int cont = 1, quantidadeAlunos;

        System.out.print("Digite a quantidade de alunos na turma: ");
        quantidadeAlunos = leitor.nextInt();

        while (cont <= quantidadeAlunos) {
            System.out.print("Digite a altura do " + cont + "º aluno: ");
            somaAlturas = somaAlturas + leitor.nextDouble();
            cont++;

        }
        media = somaAlturas / quantidadeAlunos;

        System.out.println("A média da altura dos alunos é de: " + media);

        leitor.close();
    }
}
