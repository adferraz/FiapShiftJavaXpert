import java.util.Scanner;

public class ExercicioRodizioVeiculo {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String placaVeiculo;
        char ultimoNumero;


        System.out.print("Digite os 4 ultimos digitos da placa do veículo: ");
        placaVeiculo = leitura.nextLine();

        if (placaVeiculo.length() == 4) {
            ultimoNumero = placaVeiculo.charAt(3);

            int ultimoDigito = Character.getNumericValue(ultimoNumero);

            if (ultimoDigito == 1 || ultimoDigito == 2) {
                System.out.println("PLACA XYP-"+ placaVeiculo +" Pode rodar na SEGUNDA");
            } else if (ultimoDigito == 3 || ultimoDigito == 4) {
                System.out.println("PLACA XYP-"+ placaVeiculo +" Pode rodar na TERÇA");
            } else if (ultimoDigito == 5 || ultimoDigito == 6) {
                System.out.println("PLACA XYP-"+ placaVeiculo +" Pode rodar na QUARTA");
            } else if (ultimoDigito == 7 || ultimoDigito == 8) {
                System.out.println("PLACA XYP-"+ placaVeiculo +" Pode rodar na QUINTA");
            } else if (ultimoDigito == 9 || ultimoDigito == 0) {
                System.out.println("PLACA XYP-"+ placaVeiculo +" Pode rodar na SEXTA");
            } else {
                System.out.println("Último dígito inválido.");
            }
        } else {
            System.out.println("A placa deve ter exatamente 4 dígitos.");
        }
        }
    }

