package prodincena;

public class Cena {
    double duracaoFita;
    int quantFita;

    // Builder's
    public Cena(){
    
    }
    
    public Cena(double duracaoFita, int quantFita) {
        this.duracaoFita = duracaoFita;
        this.quantFita = quantFita;
    }
    
    // Get's and Set's
    public double getDuracaoFita() {
        return duracaoFita;
    }

    public void setDuracaoFita(double duracaoFita) {
        this.duracaoFita = duracaoFita;
    }

    public int getQuantFita() {
        return quantFita;
    }

    public void setQuantFita(int quantFita) {
        this.quantFita = quantFita;
    }
}
