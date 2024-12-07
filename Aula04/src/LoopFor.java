import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int quantidadeAlunos, quantidadePares = 0, quantidadeImpares = 0;
        double notaAluno, mediaAlunosPares = 0, mediaAlunosImpares = 0;

        System.out.print("Digite a quantidade de alunos na turma: ");
        quantidadeAlunos = leitor.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notaAluno = leitor.nextDouble();
            if ((i+1) % 2 == 0){
            mediaAlunosPares = mediaAlunosPares + notaAluno;
            quantidadePares++;
        }else{
            mediaAlunosImpares = mediaAlunosImpares + notaAluno;
            quantidadeImpares++;
        }
    }

        mediaAlunosPares = mediaAlunosPares / quantidadeImpares;
        mediaAlunosImpares = mediaAlunosImpares / quantidadePares;
        System.out.println("A media das notas dos alunos Pares da turma é " + mediaAlunosPares);
        System.out.println("A media das notas dos alunos Impares da turama é " + mediaAlunosImpares);

        leitor.close();
    }
}
