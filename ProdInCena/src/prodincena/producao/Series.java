package prodincena.producao;

import java.util.ArrayList;
import prodincena.funcionarios.Funcionario;
import prodincena.main.Cena;
import prodincena.main.Verba;

public class Series extends Producao {

    public Series() {
        super(null, null, 0, null, null, null);
    }

    public Series(String nome, String horarioInicio, int duracao, ArrayList<Cena> aListCena, ArrayList<Verba> aListVerba, ArrayList<Funcionario> aListFuncionario) {
        super(nome, horarioInicio, duracao, aListCena, aListVerba, aListFuncionario);
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
    public int getDuracao() {
        return duracao;
    }

    @Override
    public void setDuracao(int duracao) {
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

    public ArrayList<Funcionario> getaListFuncionario() {
        return aListFuncionario;
    }

    public void setaListFuncionario(ArrayList<Funcionario> aListFuncionario) {
        this.aListFuncionario = aListFuncionario;
    }
}