package prodincena.funcionarios;

public class Principal extends Funcionario {
    public String nomePrincipal;
    public FuncionariosPrincipal funcaoPrincipal;
    public String tipo;
    public double salarioPrincipal;

    // Builder's
    public Principal(){
    
    }

    public Principal(String nomePrincipal, FuncionariosPrincipal funcaoPrincipal, String tipo, double salarioPrincipal) {
        this.nomePrincipal = nomePrincipal;
        this.funcaoPrincipal = funcaoPrincipal;
        this.tipo = tipo;
        this.salarioPrincipal = salarioPrincipal;
    }
    
    // Get's and Set's
    public String getNomePrincipal() {
        return nomePrincipal;
    }

    public void setNomePrincipal(String nomePrincipal) {
        this.nomePrincipal = nomePrincipal;
    }

    public FuncionariosPrincipal getFuncaoPrincipal() {
        return funcaoPrincipal;
    }

    public void setFuncaoPrincipal(FuncionariosPrincipal funcaoPrincipal) {
        this.funcaoPrincipal = funcaoPrincipal;
    }

    public double getSalarioPrincipal() {
        return salarioPrincipal;
    }

    public void setSalarioPrincipal(double salarioPrincipal) {
        this.salarioPrincipal = salarioPrincipal;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}