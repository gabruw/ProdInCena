package prodincena;

public class Verba {
    Patrocionio tipo;
    double valor;

    // Builder's
    public Verba(){
    
    }
    
    public Verba(Patrocionio tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    // Get's and Set's
    public Patrocionio getTipo() {
        return tipo;
    }

    public void setTipo(Patrocionio tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   
}