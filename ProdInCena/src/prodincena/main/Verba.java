package prodincena.main;

public class Verba {
    Patrocinio tipo;
    double valor;

    // Builder's
    public Verba(){
    
    }
    
    public Verba(Patrocinio tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    // Get's and Set's
    public Patrocinio getTipo() {
        return tipo;
    }

    public void setTipo(Patrocinio tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   
}