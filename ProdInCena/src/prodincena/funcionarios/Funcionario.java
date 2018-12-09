package prodincena.funcionarios;

public abstract class Funcionario {
    public String nome;
    public double salario;
    public String tipo;
    
    public double CalcSalario(){
        return salario;
    }
}
