package projetofemcar;

import java.util.Scanner;

public class AgendaTeste {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        AgendarServico dt = new AgendarServico();

        System.out.println("----- Agende seu serviço -------");

        System.out.print("Dia: ");
        int d1 = ler.nextInt();
        dt.setDia(d1);

        System.out.print("Mês: ");
        int m1 = ler.nextInt();
        dt.setMes(m1);

        System.out.print("Ano: ");
        int a1 = ler.nextInt();
        dt.setAno(a1);

        System.out.println("O seu serviço está marcado para: ");

        dt.exibeData();

    }
}
