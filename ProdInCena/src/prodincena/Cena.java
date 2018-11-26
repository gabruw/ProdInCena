package prodincena;

import java.util.List;
import prodincena.funcionarios.Funcionario;

public class Cena {
    double duracaoFita;
    int quantFita;
    List<Fita> ListFita;
    List<Funcionario> ListFuncionario;

    // Builder's
    public Cena(){
    
    }

    public Cena(double duracaoFita, int quantFita, List<Fita> ListFita, List<Funcionario> ListFuncionario) {
        this.duracaoFita = duracaoFita;
        this.quantFita = quantFita;
        this.ListFita = ListFita;
        this.ListFuncionario = ListFuncionario;
    }
    
    // Get's and Set's
    public double getDuracaoFita() {
        return duracaoFita;
    }

    public void setDuracaoFita(double duracaoFita) {
        this.duracaoFita = duracaoFita;
    }

    public int getQuantFita() {
        return quantFita;
    }

    public void setQuantFita(int quantFita) {
        this.quantFita = quantFita;
    }

    public List<Fita> getListFita() {
        return ListFita;
    }

    public void setListFita(List<Fita> ListFita) {
        this.ListFita = ListFita;
    }  
}