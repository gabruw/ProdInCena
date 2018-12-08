package prodincena.producao;

import java.util.ArrayList;
import prodincena.funcionarios.Funcionario;
import prodincena.main.Cena;
import prodincena.main.Verba;

public class Serie extends Producao {

    public Serie() {
        super(null, null, 0, null, null);
    }

    public Serie(String nome, String horarioInicio, int duracao, ArrayList<Cena> aListCena, ArrayList<Verba> aListVerba) {
        super(nome, horarioInicio, duracao, aListCena, aListVerba);
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