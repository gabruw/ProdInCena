package prodincena;

public class Verba {
    boolean empPublica;
    boolean empPrivada;
    boolean lic;            // Leis de incentivo a cultura
    boolean vendaProducao;

    // Builder's
    public Verba(){
    
    }
    
    public Verba(boolean empPublica, boolean empPrivada, boolean lic, boolean vendaProducao) {
        this.empPublica = empPublica;
        this.empPrivada = empPrivada;
        this.lic = lic;
        this.vendaProducao = vendaProducao;
    }
    
    // Get's and Set's
    public boolean isEmpPublica() {
        return empPublica;
    }

    public void setEmpPublica(boolean empPublica) {
        this.empPublica = empPublica;
    }

    public boolean isEmpPrivada() {
        return empPrivada;
    }

    public void setEmpPrivada(boolean empPrivada) {
        this.empPrivada = empPrivada;
    }

    public boolean isLic() {
        return lic;
    }

    public void setLic(boolean lic) {
        this.lic = lic;
    }

    public boolean isVendaProducao() {
        return vendaProducao;
    }

    public void setVendaProducao(boolean vendaProducao) {
        this.vendaProducao = vendaProducao;
    }
}
