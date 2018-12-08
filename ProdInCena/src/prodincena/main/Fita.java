package prodincena.main;

public class Fita {
    String numSerie;
    double capMinutos;

    // Builder's
    public Fita(){
    
    }
    
    public Fita(String numSerie, double capMinutos) {
        this.numSerie = numSerie;
        this.capMinutos = capMinutos;
    }
    
    // Get's and Set's
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public double getCapMinutos() {
        return capMinutos;
    }

    public void setCapMinutos(double capMinutos) {
        this.capMinutos = capMinutos;
    }
}