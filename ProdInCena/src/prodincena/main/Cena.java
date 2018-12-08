package prodincena.main;

import java.util.ArrayList;
import java.util.List;
import prodincena.funcionarios.Funcionario;

public class Cena {
    double duracaoCena;
    ArrayList<Fita> aListFita;
    ArrayList<Funcionario> aListFuncionario;

    // Builder's
    public Cena(){
    
    }

    public Cena(double duracaoCena, ArrayList<Fita> aListFita, ArrayList<Funcionario> aListFuncionario) {
        this.duracaoCena = duracaoCena;
        this.aListFita = aListFita;
        this.aListFuncionario = aListFuncionario;
    }
    
    // Get's and Set's
    public double getDuracaoCena() {
        return duracaoCena;
    }

    public void setDuracaoCena(double duracaoCena) {
        this.duracaoCena = duracaoCena;
    }

    public ArrayList<Fita> getListFita() {
        return aListFita;
    }

    public void setListFita(ArrayList<Fita> aListFita) {
        this.aListFita = aListFita;
    }  
}