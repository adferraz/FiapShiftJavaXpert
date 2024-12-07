import java.util.Scanner;

public class Vetores {

    public static final int quantidadeAlunos = 3;
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] alunos = new double[quantidadeAlunos];
        double total = 0;

        for (int i = 0; i < alunos.length; i++){
            System.out.print("Digite o consumo do " + (i + 1) + "º aluno: ");
            alunos[i] = leitor.nextDouble();
            total = total + alunos[i];
        }

        for (int i = 0; i < alunos.length; i++){
            System.out.println("O aluno " + (i+1) + " consumiu R$" + alunos[i]);
        }
        System.out.println("O total de consumo foi de R$" + total);

        leitor.close();
    }
}
