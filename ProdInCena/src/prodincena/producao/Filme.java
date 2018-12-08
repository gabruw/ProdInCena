package prodincena.producao;

import java.util.ArrayList;
import prodincena.funcionarios.Funcionario;
import prodincena.main.Cena;
import prodincena.main.Verba;

public class Filme extends Producao {
    boolean IsLeiIncentivo = false;

    public Filme() {
        super(null, null, 0, null, null);
    }

    public Filme(String nome, String horarioInicio, double duracao, ArrayList<Cena> aListCena, ArrayList<Verba> aListVerba) {
        super(nome, horarioInicio, duracao, aListCena, aListVerba);
    }
    
    public boolean isIsLeiIncentivo() {
        return IsLeiIncentivo;
    }

    public void setIsLeiIncentivo(boolean IsLeiIncentivo) {
        this.IsLeiIncentivo = IsLeiIncentivo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getHorarioInicio() {
        return horarioInicio;
    }

    @Override
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    @Override
    public double getDuracao() {
        return duracao;
    }

    @Override
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Cena> getaListCena() {
        return aListCena;
    }

    public void setaListCena(ArrayList<Cena> aListCena) {
        this.aListCena = aListCena;
    }

    public ArrayList<Verba> getaListVerba() {
        return aListVerba;
    }

    public void setaListVerba(ArrayList<Verba> aListVerba) {
        this.aListVerba = aListVerba;
    }
}