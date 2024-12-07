import java.util.Scanner;

public class AssistenciaTecnica {

    //Constante = tamanho do vetor
    static final int MAX = 50;
    static String[] clientesNome = new String[MAX];
    static String[] clientesCPF = new String[MAX];
    static String[] clientesTelefone = new String[MAX];
    static String[] equipamentosSerie = new String[MAX];
    static String[] equipamentosDescricao = new String[MAX];
    static String[] equipamentosStatus = new String[MAX];
    static String[] servicoSerie = new String[MAX];
    static String[] servicoCPF = new String[MAX];
    static String[] servicoDescricao = new String[MAX];
    static double[] servicoValor = new double[MAX];
    static int quantidadeClientes = 0, qtdEquipamento = 0, qtdServico = 0;


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Equipamento");
            System.out.println("3. Cadastrar Serviço");
            System.out.println("4. Consultar Serviços por CPF");
            System.out.println("5. Consultar Equipamentos em Reparo");
            System.out.println("6. Total de Equipamentos em Reparo");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1 -> cadastrarCliente(leitor);
                case 2 -> cadastrarEquipamento(leitor);
                case 3 -> cadastrarServico(leitor);
                case 4 -> consultarServicosPorCPF(leitor);
                case 5 -> consultarEquipamentosEmReparo(leitor);
                case 6 -> exibirTotalEquipamentosEmReparo();
                case 7 -> {
                    System.out.println("Finalizando o sistema ..........");
                    System.out.println("Até logo");
                }
                default -> System.out.printf("Opção inválida");
            }

        }while(opcao != 7);
    }

    public static int contarEquipamentosEmReparo(){
        int total = 0;
        for(int i =0; i < qtdEquipamento; i++){
            if("Em reparo".equals(equipamentosStatus[i])){
                total++;
            }
        }
        return total;
    }
    public static void exibirTotalEquipamentosEmReparo(){
        System.out.printf("Total de equipamentos em reparo %d\n", contarEquipamentosEmReparo());
    }
    public static void consultarEquipamentosEmReparo(Scanner leitor){
        System.out.println("Equipamentos em reparo:");
        boolean encontrado = false;
        for(int i =0; i < qtdEquipamento; i++){
            if(equipamentosStatus[i].equalsIgnoreCase("Em reparo")){
                System.out.printf("Número de série: %s | Descrição: %s\n",
                        equipamentosSerie[i], equipamentosDescricao[i]);
                encontrado = true;
            }
        }
        if(!encontrado) System.out.printf("Nenhum equipamento em reparo.");

    }

    public static void consultarServicosPorCPF(Scanner leitor) {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = leitor.nextLine();
        boolean encontrado = false;
        System.out.println("Serviços encontrados:");
        for(int i = 0; i < qtdServico; i++){
            if(servicoCPF[i].equals(cpf)){
                System.out.printf("Equipamento: %s | Descrição: %s | Valor: %.2f\n",
                        servicoSerie[i], servicoDescricao[i], servicoValor[i]);
                encontrado = true;
            }
            if(!encontrado) System.out.printf("Nenhum serviço encotrado para este CPF.");
        }
    }

    private static void cadastrarServico(Scanner leitor) {
        if(qtdServico >= MAX){
            System.out.println("Limite de equipamentos atingido!");
            return;
        }
        System.out.println("Número de Série do Equipamento: ");
        servicoSerie[qtdServico] = leitor.nextLine();
        System.out.println("CPF do cliente: ");
        servicoCPF[qtdServico] = leitor.nextLine();
        System.out.println("Descrição do serviço: ");
        servicoDescricao[qtdServico] = leitor.nextLine();
        System.out.println("Valor: ");
        servicoValor[qtdServico] = leitor.nextDouble();
        leitor.nextLine();
        qtdServico++;
        System.out.println("Serviço foi cadastrado com sucesso!");
    }

    private static void cadastrarEquipamento(Scanner leitor) {
        if(qtdEquipamento >= MAX){
            System.out.println("Limite de equipamentos atingido!");
            return;
        }
        System.out.println("Número de Série: ");
        equipamentosSerie[qtdEquipamento] = leitor.nextLine();
        System.out.println("Descrição: ");
        equipamentosDescricao[qtdEquipamento] = leitor.nextLine();
        System.out.println("Status: ");
        equipamentosStatus[qtdEquipamento] = leitor.nextLine();
        qtdEquipamento++;
        System.out.println("Equipamento foi cadastrado com sucesso!");

    }

    private static void cadastrarCliente(Scanner leitor) {

        if(quantidadeClientes >= MAX){
            System.out.println("Limite de clientes atingido!");
        }
        else {
            System.out.println("Nome: ");
            clientesNome[quantidadeClientes] = leitor.nextLine();
            System.out.println("CPF: ");
            clientesCPF[quantidadeClientes] = leitor.nextLine();
            System.out.println("Telefone: ");
            clientesTelefone[quantidadeClientes] = leitor.nextLine();
            quantidadeClientes++;
            System.out.println("Cliente foi cadastrado com sucesso!");
        }
    }
}
