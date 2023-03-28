import java.util.Hashtable;
import java.util.Scanner;


public class AgendaContatos {

    private static Hashtable<String, Contato> tabelaHash = new Hashtable<String, Contato>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Excluir contato");
            System.out.println("3. Pesquisar contato por nome");
            System.out.println("4. Exibir lista de contatos");
            System.out.println("5. Sair");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    adicionarContato(scanner);
                    break;
                case 2:
                    excluirContato(scanner);
                    break;
                case 3:
                    pesquisarContato(scanner);
                    break;
                case 4:
                    exibirListaContatos();
                    break;
                case 5:
                    System.out.println("Encerrando agenda de contatos.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
    }
    private static void adicionarContato(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String nascimento = scanner.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite o celular: ");
        String celular = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, nascimento, email, celular);
        tabelaHash.put(nome, contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void excluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja excluir: ");
        String nome = scanner.nextLine();

        if (tabelaHash.containsKey(nome)) {
            tabelaHash.remove(nome);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    private static void pesquisarContato(Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja pesquisar: ");
        String nome = scanner.nextLine();

        if (tabelaHash.containsKey(nome)) {
            Contato contato = tabelaHash.get(nome);
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    private static void exibirListaContatos() {
        if (tabelaHash.isEmpty()) {
            System.out.println("Agenda de contatos vazia.");
        } else {
            for (Contato contato : tabelaHash.values()) {
                System.out.println(contato);
            }
        }
    }
}



    

