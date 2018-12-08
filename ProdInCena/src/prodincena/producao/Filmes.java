package prodincena.producao;

import prodincena.producao.Producao;
import java.text.DateFormat;
import java.util.ArrayList;

public class Filmes extends Producao {
   
    boolean IsLeiIncentivo = false;
    
    public Filmes (String nome, String horarioInicio, int duracao, double orcamento, boolean IsLeiIncentivo) {
        super(nome, horarioInicio, duracao, orcamento);
        this.IsLeiIncentivo = IsLeiIncentivo;
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

