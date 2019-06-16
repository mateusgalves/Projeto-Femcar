package projetofemcar;

public class AvaliacaoOficina {

    private String nomeOficina;
    private int c;
    private double notas[] = new double[1];


  
    public AvaliacaoOficina(double[] notas, String nomecurso) {
        this.notas = notas;
        this.nomeOficina = nomeOficina;
    }

    public void setNotas(double n) {
        System.out.print(n);
    }

    public double[] getNotas() {
        return notas;
    }

}
