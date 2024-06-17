import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Remover Usuário");
            System.out.println("3. Buscar Usuário");
            System.out.println("4. Listar Usuários");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do usuário: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String email = scanner.nextLine();
                    Usuario usuario = new Usuario(id, nome, email);
                    gerenciador.adicionarUsuario(usuario);
                    System.out.println("Usuário adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o ID do usuário a ser removido: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerUsuario(idRemover);
                    System.out.println("Usuário removido com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o ID do usuário a ser buscado: ");
                    int idBuscar = scanner.nextInt();
                    Usuario usuarioBuscado = gerenciador.buscarUsuarioId(idBuscar);
                    if (usuarioBuscado != null) {
                        System.out.println("Usuário encontrado: " + usuarioBuscado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de Usuários:");
                    for (Usuario u : gerenciador.listarUsuarios()) {
                        System.out.println(u);
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
