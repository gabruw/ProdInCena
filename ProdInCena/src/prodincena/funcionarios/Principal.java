package prodincena.funcionarios;

public class Principal extends Funcionario {
    public String nomePrincipal;
    FuncionariosPrincipal funcaoPrincipal;
    public double salarioPrincipal;

    // Builder's
    public Principal(){
    
    }

    public Principal(String nomePrincipal, FuncionariosPrincipal funcaoPrincipal, double salarioPrincipal) {
        this.nomePrincipal = nomePrincipal;
        this.funcaoPrincipal = funcaoPrincipal;
        this.salarioPrincipal = salarioPrincipal;
    }
    
    public double CalcSalario(int numCenas, int numProducao, double salario)
    {
        salario = (numCenas * salario) + (numProducao * salario);
        
        return salario;
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
}