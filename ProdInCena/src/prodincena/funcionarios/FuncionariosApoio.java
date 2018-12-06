package prodincena.funcionarios;

public enum FuncionariosApoio {
    CAMERA("Camera"), 
    ILUMINADOR("Iluminador"), 
    CONTRARREGRA("Contrarregra"), 
    PRODUTOR("Produtor"), 
    MAQUIAGEM("Maquiagem");
    
    public String valSalario;

    private FuncionariosApoio(String valSalario) {
        this.valSalario = valSalario;
    }

    public String getFuncionariosApoio() {
        return valSalario;
    }
}