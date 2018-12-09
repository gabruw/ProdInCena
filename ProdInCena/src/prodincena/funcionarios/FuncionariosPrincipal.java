package prodincena.funcionarios;

public enum FuncionariosPrincipal {
    ATOR("Ator"), 
    DUBLE("Duble");
    
    public String valSalario;

    private FuncionariosPrincipal(String valSalario) {
        this.valSalario = valSalario;
    }

    public String getFuncionariosApoio() {
        return valSalario;
    }
}