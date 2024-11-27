import java.util.Scanner;

public class DesvioComposto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double doacao;
        double investimento;
        double sobra;

        System.out.print("Digite o valor da doação: R$");
        doacao = leitor.nextDouble();

        if (doacao >= 1000){
            sobra = doacao * (1 - 0.15);
            investimento = doacao - sobra;
            System.out.println("O valor da doação ultrapassou R$ 1.000,00 sendo investido R$" + investimento + " e sobrando R$" + sobra);
        }else {
            sobra = doacao * (1 - 0.05);
            investimento = doacao - sobra;
            System.out.println("O valor da doação é menor que R$ 1.000,00 sendo investido R$" + investimento + " e sobrando R$" + sobra);
        }
        leitor.close();
    }
}
