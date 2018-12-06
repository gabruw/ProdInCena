package prodincena;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Produção {
    public String nome;    
    public LocalTime horarioInicio;
    public DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    public String horaFormatada = formatter.format(horarioInicio);
    public int duracao;
    public double orcamento;
    public ArrayList<String> verbas = new ArrayList<>();
    public ArrayList<String> funcionario = new ArrayList<>();
    public ArrayList<String> cenas = new ArrayList<>();

    public Produção(String nome, LocalTime horarioInicio, int duracao, double orcamento) {
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.duracao = duracao;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public ArrayList<String> getVerbas() {
        return verbas;
    }

    public void setVerbas(ArrayList<String> verbas) {
        this.verbas = verbas;
    }

    public ArrayList<String> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ArrayList<String> funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<String> getCenas() {
        return cenas;
    }

    public void setCenas(ArrayList<String> cenas) {
        this.cenas = cenas;
    }  
}
