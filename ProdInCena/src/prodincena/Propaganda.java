package prodincena;

import java.text.DateFormat;
import java.util.ArrayList;

public class Propaganda extends Produção {
    public Propaganda (String nome, String horarioInicio, int duracao, double orcamento) {
        super(nome, horarioInicio, duracao, orcamento);
          ArrayList<String> verbas = new ArrayList<>();
          ArrayList<String> funcionario = new ArrayList<>();
          ArrayList<String> cenas = new ArrayList<>(); 
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
