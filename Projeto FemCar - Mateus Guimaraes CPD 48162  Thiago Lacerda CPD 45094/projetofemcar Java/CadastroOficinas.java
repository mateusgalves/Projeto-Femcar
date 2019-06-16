package projetofemcar;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastroOficinas {

    private static CadastroOficinas Main;

    private final Scanner l;
    private boolean exe;
    private final List<DadosOficina> dados;

    public static void main(String[] args) {
        Main  = new CadastroOficinas();
    }

    private CadastroOficinas() {
        l = new Scanner(System.in);
        exe = true;
        dados = new ArrayList<>();

        System.out.println("BEM VINDO AO CADASTRO DE OFICINAS");

        while (exe) {
            String opcao = menu();

            if (opcao.equalsIgnoreCase("1")) {
                cadastrar();
            } else if (opcao.equalsIgnoreCase("2")) {
                listarCadastros();
            } else if (opcao.equalsIgnoreCase("0")) {
                exe = false;
            } else {
                System.out.println("\nOpção Inválida! \n");
            }
        }
    }

    private String menu() {
        System.out.println("Selecione a opção:");
        System.out.println("1 - Novo cadastro");
        System.out.println("2 - Listar cadastros");
        System.out.println("0 - Sair");
        return l.nextLine();
    }

    private void cadastrar() {
        boolean cadastrando = true;

        while (cadastrando) {
            System.out.println("Cadastro de Usuário");
            DadosOficina d = new DadosOficina();
            d.setNome(textInput("Nome:"));
            d.setLogin(textInput("Login: "));
            d.setTelefone(textInput("Telefone: "));
            d.setCnpj(textInput("CPF: "));
            d.setSenha(textInput("Senha: "));
            String cadastrar = textInput("Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("Cadastro adicionado!");
                dados.add(d);
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("Cadastro ignorado!");
            } else {
                System.out.println("\nOpção inválida! \n");
            }

            String continua = textInput("Continuar cadastrando (S/N) ?");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
               
            } else {
                System.out.println("\nOpção inválida! \n");
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
                DadosOficina d = dados.get(i);
                System.out.println("Cadastro número: " + i);
                System.out.println("\tNome: " + d.getNome());
                System.out.println("\tLogin: " + d.getLogin());
                System.out.println("\tTelefone: " + d.getTelefone());
                System.out.println("\tCPF: " + d.getCnpj());
                System.out.println("\tSenha: " + d.getSenha());
            }
            System.out.println("\nFim da lista\n");
        }
    }

    private String textInput(String label) {
        System.out.println(label);
        return l.nextLine();
    }
}
