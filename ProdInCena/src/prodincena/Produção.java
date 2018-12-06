package prodincena;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Produção {
    public String nome;    
    public String horarioInicio;

    public int duracao;
    public double orcamento;
   

    public Produção(String nome, String horarioInicio, int duracao, double orcamento) {
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.duracao = duracao;
        this.orcamento = orcamento;
        ArrayList<String> verbas = new ArrayList<>();
        ArrayList<String> funcionario = new ArrayList<>();
        ArrayList<String> cenas = new ArrayList<>();
    }

    private String FormatarHorario(String horarioInicio)
    {
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatter.format(horarioInicio);
        
        return horaFormatada;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
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
}
