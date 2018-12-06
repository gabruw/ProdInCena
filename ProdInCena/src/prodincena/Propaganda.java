/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodincena;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Propaganda extends Produção {
    public Propaganda (String nome, String horarioInicio, int duracao, double orcamento) {
        super(nome, horarioInicio, duracao, orcamento);
          ArrayList<String> verbas = new ArrayList<>();
          ArrayList<String> funcionario = new ArrayList<>();
          ArrayList<String> cenas = new ArrayList<>(); 
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

    public DateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(DateFormat formatter) {
        this.formatter = formatter;
    }

    public String getHoraFormatada() {
        return horaFormatada;
    }

    public void setHoraFormatada(String horaFormatada) {
        this.horaFormatada = horaFormatada;
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
