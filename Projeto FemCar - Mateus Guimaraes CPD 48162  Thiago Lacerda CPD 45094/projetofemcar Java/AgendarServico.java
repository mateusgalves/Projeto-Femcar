package projetofemcar;

public class AgendarServico {

    private int mes;
    private int dia;
    private int ano;

    public void setMes(int m) {
        mes = m;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int d) {
        dia = d;
    }

    public int getDia() {
        return dia;
    }

    public void setAno(int a) {
        ano = a;
    }

    public int getAno() {
        return ano;
    }

    public void exibeData() {
        System.out.println("Data: " + getDia() + "/" + getMes() + "/" + getAno());

    }
}
