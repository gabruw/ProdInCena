package prodincena;

public class Verba {
    String tipo;
    double valor;

    // Builder's
    public Verba(){
    
    }
    
    public Verba(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    // Get's and Set's
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }   
}