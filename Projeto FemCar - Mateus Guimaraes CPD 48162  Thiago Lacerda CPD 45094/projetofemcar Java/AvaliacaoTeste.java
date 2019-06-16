package projetofemcar;

import java.util.Scanner;

public class AvaliacaoTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da Oficina: ");
        String nomeOficina = sc.nextLine();

        System.out.println("Digite as notas ");
 
        
        double[] notas = new double[1];
        for (int c = 0; c < notas.length; c++) {
            System.out.println("Digite a nota pelo atendimento: ");
            notas[c] = sc.nextDouble();
            System.out.println("Digite a nota pelo preço do serviço: ");
            notas[c] = sc.nextDouble();
            System.out.println("Digite a nota pela limpeza do ambiente: ");
            notas[c] = sc.nextDouble();
            System.out.println("Digite a nota pelo tempo do serviço: ");
            notas[c] = sc.nextDouble();                      

        }
         
        
        
    }

}
