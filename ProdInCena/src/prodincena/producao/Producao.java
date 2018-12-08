package prodincena.producao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import prodincena.funcionarios.Funcionario;
import prodincena.main.Cena;
import prodincena.main.Verba;

public abstract class Producao {
    public String nome;    
    public String horarioInicio;

    public int duracao;
   
    public ArrayList<Cena> aListCena = new ArrayList<>();
    public ArrayList<Verba> aListVerba = new ArrayList<>();
    public ArrayList<Funcionario> aListFuncionario = new ArrayList<>();

    public Producao(String nome, String horarioInicio, int duracao, ArrayList<Cena> aListCena, ArrayList<Verba> aListVerba, ArrayList<Funcionario> aListFuncionario) {
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.duracao = duracao;
        this.aListCena = aListCena;
        this.aListVerba = aListVerba;
        this.aListFuncionario = aListFuncionario;
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
}
