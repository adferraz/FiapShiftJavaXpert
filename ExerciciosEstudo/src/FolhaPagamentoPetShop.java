import java.util.Scanner;

public class FolhaPagamentoPetShop {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double salarioFuncionario, valorHora, valorHoraExtra, salarioExtra, salarioTotal;
        int cargaHoraria, horasTrabalhadas, horasExtras;

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = leitor.nextInt();

        System.out.print("Digite o valor da hora (R$): ");
        valorHora = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas extras trabalhadas no mês: ");
        horasExtras = leitor.nextInt();

        salarioFuncionario = horasTrabalhadas * valorHora;

        valorHoraExtra = valorHora * 1.5;
        salarioExtra = horasExtras * valorHoraExtra;

        salarioTotal = salarioFuncionario + salarioExtra;

        System.out.println("Salário do Funcionário: R$" + salarioFuncionario);
        System.out.println("Valor da hora extra: R$" + valorHoraExtra);
        System.out.println("Salário por horas extras: R$" + salarioExtra);
        System.out.println("Salário Total: R$" + salarioTotal);

        leitor.close();

    }
}
