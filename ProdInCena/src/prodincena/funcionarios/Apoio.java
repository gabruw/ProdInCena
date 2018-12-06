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
    
    public double CalcSalario(FuncionariosApoio funcaoApoio)
    {
        String funcaoParsed = funcaoApoio.toString();
        
        switch(funcaoParsed)
        {
            case "CAMERA":
                salario = 1100.00;
                break;
            case "ILUMINADOR":
                salario = 950.00;
                break;
            case "CONTRARREGRA":
                salario = 1000.00;
                break;
            case "PRODUTOR":
                salario = 2000.00;
                break;
            case "MAQUIAGEM":
                salario = 1300.00;
                break;
            default:
                System.out.println("Essa profissão não está cadastrada!");
                break;
        }
        
        return salario;
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