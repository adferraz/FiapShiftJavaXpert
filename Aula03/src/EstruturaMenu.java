import java.util.Scanner;

public class EstruturaMenu {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao=0;

        while (opcao != 4) {
            System.out.print("\n===========================================");
            System.out.print("ESTRUTURA DE MENUS");
            System.out.println("===========================================\n");
            System.out.println("Escolha uma opção: \n1 - Cadastrar \n2 - Alterar \n3 - Excluir \n4 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolhei a opção 1");
                    break;
                case 2:
                    System.out.println("Você escolhei a opção 2");
                    break;
                case 3:
                    System.out.println("Você escolhei a opção 3");
                    break;
                case 4:
                    System.out.println("OK! Saindo do sistema...");
                    break;
                default:
                    System.out.println("A opção escolhida não existe...");
            }
        }
        leitor.close();
    }
}
