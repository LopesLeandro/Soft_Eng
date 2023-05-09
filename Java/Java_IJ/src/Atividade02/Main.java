package Atividade02;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (true) {
            System.out.println("-----------------------");
            System.out.println("|  Gestão  Financeira |");
            System.out.println("-----------------------");
            System.out.println("1 - Adicionar Gastos");
            System.out.println("2 - Adicionar Ganhos");
            System.out.println("3 - Relatório de Gastos");
            System.out.println("4 - Relatório de Ganhos");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - Sair");
            System.out.println("Selecione uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Gasto");
                    System.out.println("-----------------------");
                    System.out.println("Informe o tipo de gasto: [1-Habitação] [2-Alimentação] [3-Transporte] [4-Lazer] [5-Outros]");

                    //Inicia validacao dos dados do tipo de gasto
                    int tipoGasto = 0;
                    boolean validInput;
                    do {
                        try {
                            tipoGasto = Integer.parseInt(scanner.nextLine());
                            validInput = validacoes.validartipoGasto(tipoGasto);
                            if (!validInput) {
                                System.out.println("Por favor, insira um número válido!");
                            }
                        } catch (NumberFormatException e){
                            System.out.println("Entrada inválida, insira apenas números!");
                            validInput = false;
                        }
                    } while (!validInput);
                    //Encerra validacao dos dados do tipo de gasto

                    //Inicia validacao dos dados no formato correto de data
                    String dataStr;
                    LocalDate dataGasto = null;
                    do {
                        System.out.println("Informe a data (formato: DD/MM/AAAA):");
                        dataStr = scanner.nextLine();
                        if (validacoes.validarData(dataStr)){
                            dataGasto = LocalDate.parse(dataStr, formatter);
                            validInput = true;
                        } else {
                            System.out.println("Data inválida, por favor insira no formato correto (DD/MM/AAAA).");
                            validInput = false;
                        }
                    } while (!validInput);
                    //Encerra validacao dos dados no formato correto de data

                    //Inicia validacao de valor maior que zero

                    //Encerra validacao de valor maior que zero
                    System.out.println("Informe o valor: R$ ");
                    double valorGasto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Selecione a forma de pagamento: [1-Dinheiro] [2-Débito] [3-Crédito] [4-Pix]");
                    int formaDePagamento = Integer.parseInt(scanner.nextLine());

                    Gasto gasto = new Gasto(tipoGasto, dataGasto, valorGasto, formaDePagamento);
                    financeiro.adicionarGasto(gasto);
                    break;

                case 2:
                    System.out.println("Adicionar Ganho");
                    System.out.println("-----------------------");
                    System.out.println("Informe o tipo de ganho: [Salário] [Investimentos] [Outros]");
                    String tipoGanho = scanner.nextLine();
                    System.out.println("Informe a data (formato: DD/MM/AAAA):");
                    LocalDate dataGanho = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.println("Informe o valor: R$");
                    double valorGanho = scanner.nextDouble();
                    scanner.nextLine();

                    Ganho ganho = new Ganho(tipoGanho, dataGanho, valorGanho);
                    financeiro.adicionarGanho(ganho);
                    break;

                case 3:
                    financeiro.relatorioGastos();
                    break;

                case 4:
                    financeiro.relatorioGanhos();
                    break;

                case 5:
                    System.out.println("Informe o mês e ano que deseja verificar (formato: MM/AAAA):");
                    String monthYearInput = scanner.nextLine();
                    DateTimeFormatter monthYearFormatter = DateTimeFormatter.ofPattern("MM/yyyy");
                    YearMonth selectedMonth = YearMonth.parse(monthYearInput, monthYearFormatter);
                    financeiro.relatorioMensal(selectedMonth);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
