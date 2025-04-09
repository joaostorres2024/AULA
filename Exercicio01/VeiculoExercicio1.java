package Exercicio1;

public class Veículo {
    private String nomeDoCarro;
    private String marcaDoCarro;
    private int anoDoCarro;
    private double kilometragemDoCarro;
    private String corDoCarro;
    private String usado;

    public Veículo(String nomeDoCarro, String marcaDoCarro, int anoDoCarro, double kilometragemDoCarro, String corDoCarro, String usado) {
        this.nomeDoCarro = nomeDoCarro;
        this.marcaDoCarro = marcaDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.kilometragemDoCarro = kilometragemDoCarro;
        this.corDoCarro = corDoCarro;
        this.usado = usado;
    }

    public Veículo( ) {

    }

    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public double getKilometragemDoCarro() {
        return kilometragemDoCarro;
    }

    public void setKilometragemDoCarro(double kilometragemDoCarro) {
        this.kilometragemDoCarro = kilometragemDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public String getUsado() {
        return usado;
    }

    public void setUsado(String usado) {
        this.usado = usado;
    }
}
