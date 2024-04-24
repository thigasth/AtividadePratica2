public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONÁRIO SYSTEM");
        System.out.println("1) Cadastrar Cliente");
        System.out.println("2) Cadastrar Funcionário");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Procurar Funcionário");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir Cadastro Específico");
        System.out.println("7) Excluir Todos os Cadastros");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void excluirCadastro() {
        System.out.println("\nExcluir Cadastro:");
        System.out.print("ID do cadastro a ser excluído: ");
        int id = Console.lerInt();

        boolean removido = Cadastro.remover(id);
        if (removido) {
            System.out.println("\nCadastro removido com sucesso!");
        } else {
            System.out.println("\nCadastro com ID " + id + " não encontrado.");
        }
    }

    private static void excluirTodosCadastro() {
        Cadastro.limparLista();
        System.out.println("\nTodos os registros foram excluídos.");
    }

    private static void verificarOpcao(int op) {

        int id;
        String nome;
        String email;
        String cargo;
        String curso;

        switch (op) {
            case 1:

                System.out.println("\nNovo Cliente:");

                System.out.print("\nID: ");
                id = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Email: ");
                email = Console.lerString();

                Cliente c = new Cliente(id, nome, email);

                Cadastro.cadastrar(c);

                System.out.println("\nCliente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Funcionário:");

                System.out.print("\nID: ");
                id = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Cargo: ");
                cargo = Console.lerString();

                Funcionario f = new Funcionario(id, nome, cargo);

                Cadastro.cadastrar(f);

                System.out.println("\nFuncionário cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nNovo Funcionário:");

                System.out.print("\nID: ");
                id = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Curso: ");
                curso = Console.lerString();

                Estagiario e = new Estagiario(id, nome, curso);

                Cadastro.cadastrar(e);

                System.out.println("\nEstagiário cadastrado com sucesso!");

                break;


            case 4:

                System.out.println("\nProcurar Funcionário:");

                System.out.print("\nID: ");
                id = Console.lerInt();

                Pessoa p = Cadastro.buscar(id);

                if (p != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(p.toString());
                    return;
                }

                System.out.println("\nFuncionário " + id + " não foi encontrado.");

                break;

            case 5:

                System.out.println("\nTodos as pessoas cadastrados:");

                if (Cadastro.getListaPessoas() == null || Cadastro.getListaPessoas().isEmpty()) {

                    System.out.println("\nNão há pessoas cadastradas...");
                    return;

                }

                for (Pessoa temp : Cadastro.getListaPessoas()) {

                    System.out.println(temp.toString());

                }

                break;

            case 6:

                excluirCadastro();
                break;

            case 7:

                excluirTodosCadastro();
                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;

        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
