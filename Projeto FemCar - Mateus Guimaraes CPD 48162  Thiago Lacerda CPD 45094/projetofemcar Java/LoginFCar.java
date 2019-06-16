
import java.util.Scanner;


public class LoginFCar {
    




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DadosUsuarios du = new DadosUsuarios();
        
      
        System.out.println("LOGIN: ");
        String login = in.nextLine();
      
        System.out.println("SENHA: ");
        String senha = in.nextLine();
        
        if(login.equals(du.getLogin()) && senha.equals(du.getSenha())){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}