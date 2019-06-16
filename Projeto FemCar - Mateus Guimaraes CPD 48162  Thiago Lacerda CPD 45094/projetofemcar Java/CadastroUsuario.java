package projetofemcar;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario {

    private Scanner l;
    private boolean execute;
    private List<DadosUsuarios> dados;

    public static void main(String[] args) {
        new CadastroUsuario();
    }

    private CadastroUsuario() {
        l = new Scanner(System.in);
        execute = true;
        dados = new ArrayList<DadosUsuarios>();

        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");

        while (execute) {
            String opcao = menu();

            if (opcao.equalsIgnoreCase("n")) {
                cadastrar();
            } else if (opcao.equalsIgnoreCase("l")) {
                listarCadastros();
            } else if (opcao.equalsIgnoreCase("s")) {
                execute = false;
            } else {
                System.out.println("\nOpção Inválida !!! \n");
            }
        }
    }

    private String menu() {
        System.out.println("Selecione a opção:");
        System.out.println("N - Novo cadastro");
        System.out.println("L - Listar cadastros");
        System.out.println("S - Sair");
        return l.nextLine();
    }

    private void cadastrar() {
        boolean cadastrando = true;

        while (cadastrando) {
            System.out.println("Cadastro de Usuário");
            DadosUsuarios d = new DadosUsuarios();
            d.setNome(textInput("Nome:"));
            d.setLogin(textInput("Login: "));
            d.setSenha(textInput("Senha: "));
            d.setCpf(textInput("CPF: "));

            String cadastrar = textInput("Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("Cadastro adicionado !!!");
                dados.add(d);
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("Cadastro ignorado !!!");
            } else {
                System.out.println("\nOpção inválida! Cliente já cadastrado !!! \n");
            }

            String continua = textInput("Continuar cadastrando (S/N) ?");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
           
            } else {
                System.out.println("\nOpção inválida! Cliente já cadastrado !!! \n");
                cadastrando = false;
            }
        }
    }

    private void listarCadastros() {
        if (dados.size() == 0) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("\nLista de Cadastros\n");
            for (int i = 0; i < dados.size(); i++) {
                DadosUsuarios d = dados.get(i);

                System.out.println("Cadastro número: " + i);
                System.out.println("\tNome: " + d.getNome());
                System.out.println("\tLogin: " + d.getLogin());
                System.out.println("\tSenha: " + d.getSenha());
                System.out.print("\tCPF: " + d.getCpf());

            }
            System.out.println("\nFim da lista\n");
        }
    }

    private String textInput(String label) {
        System.out.println(label);
        return l.nextLine();
    }
}
