import java.util.Scanner;

/**
 * Main.java
 * Aplicação interativa com menu para usar a locadora.
 */
public class Main {
    public static void main(String[] args) {
        Locadoras locadora = new Locadoras();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n=== SISTEMA DE LOCADORA ===");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Alugar carro");
            System.out.println("4 - Devolver carro");
            System.out.println("5 - Listar carros disponíveis");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = sc.nextLine();
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número de 1 a 6.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Carro ---");
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine().trim();
                    System.out.print("Ano: ");
                    int ano = readInt(sc);
                    System.out.print("Cor: ");
                    String cor = sc.nextLine().trim();

                    Carros carro = new Carros(modelo, ano, cor);
                    locadora.cadastrarCarro(carro);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Cliente ---");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine().trim();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine().trim();
                    System.out.print("Idade: ");
                    int idade = readInt(sc);

                    Clientes cliente = new Clientes(nome, cpf, idade);
                    locadora.cadastrarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Alugar Carro ---");
                    System.out.print("Modelo desejado: ");
                    String modeloAluguel = sc.nextLine().trim();
                    boolean alugado = locadora.alugarCarro(modeloAluguel);

                    if (alugado) {
                        System.out.println("Carro alugado com sucesso!");
                    } else {
                        System.out.println("Não foi possível alugar. Carro não encontrado ou indisponível.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Devolver Carro ---");
                    System.out.print("Modelo a devolver: ");
                    String modeloDevolucao = sc.nextLine().trim();
                    boolean devolvido = locadora.devolverCarro(modeloDevolucao);

                    if (devolvido) {
                        System.out.println("Carro devolvido com sucesso!");
                    } else {
                        System.out.println("Não foi possível devolver. Verifique se o modelo está correto e se o carro estava alugado.");
                    }
                    break;

                case 5:
                    locadora.listarCarrosDisponiveis();
                    break;

                case 6:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha entre 1 e 6.");
                    break;
            }
        }

        sc.close();
    }

    // Método auxiliar para ler inteiros com tratamento de erro.
    private static int readInt(Scanner sc) {
        while (true) {
            String linha = sc.nextLine();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }
}
