package prodincena.funcionarios;

public class Apoio extends Funcionario{
    public String nomeApoio;
    public FuncionariosApoio funcaoApoio;
    public double salarioApoio;

    // Builder's
    public Apoio(){
    
    }

    public Apoio(String nomeApoio, FuncionariosApoio funcaoApoio, double salarioApoio) {
        this.nomeApoio = nomeApoio;
        this.funcaoApoio = funcaoApoio;
        this.salarioApoio = salarioApoio;
    }
    
    // Get's and Set's
    public String getNomeApoio() {
        return nomeApoio;
    }

    public void setNomeApoio(String nomeApoio) {
        this.nomeApoio = nomeApoio;
    }

    public FuncionariosApoio getFuncaoApoio() {
        return funcaoApoio;
    }

    public void setFuncaoApoio(FuncionariosApoio funcaoApoio) {
        this.funcaoApoio = funcaoApoio;
    }

    public double getSalarioApoio() {
        return salarioApoio;
    }

    public void setSalarioApoio(double salarioApoio) {
        this.salarioApoio = salarioApoio;
    }
}