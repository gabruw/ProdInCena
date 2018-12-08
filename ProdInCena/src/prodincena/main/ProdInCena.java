package prodincena.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import prodincena.producao.Producao;
import java.util.ArrayList;
import java.util.Scanner;
import prodincena.funcionarios.Apoio;
import prodincena.funcionarios.Funcionario;
import prodincena.funcionarios.FuncionariosApoio;
import prodincena.funcionarios.FuncionariosPrincipal;
import prodincena.funcionarios.Principal;
import prodincena.producao.Filme;
import prodincena.producao.Novela;
import prodincena.producao.Propaganda;
import prodincena.producao.Serie;
import prodincena.producao.ShowBanda;

public class ProdInCena {

    Scanner input = new Scanner(System.in);

    ArrayList<Verba> aListVerba = new ArrayList<>();
    ArrayList<Cena> aListCena = new ArrayList<>();
    ArrayList<Producao> aListProducao = new ArrayList<>();

    //Variáveis de opção
    public int opi = 0;
    public String ops = "";
    public String opsf = "";
    public double opd = 0.0;
    public double opd2 = 0.0;
    public boolean opb = false;

    //Método que calcula o salário do Funcionario Principal
    public double CalcSalarioPrincipal(String nome, double salarioPorCena, double salarioPorProducao) {
        boolean checkProd = false;
        int countProducao = 0;
        int countCena = 0;

        for (Producao producao : aListProducao) {
            for (Cena cena : producao.aListCena) {
                for (Funcionario funcionario : cena.aListFuncionario) {
                    if (funcionario.nome.equals(nome)) {
                        countCena++;
                        checkProd = true;
                    }
                }
            }

            if (checkProd) {
                countProducao++;
            }
        }

        return ((salarioPorCena * countCena) + (salarioPorProducao * countProducao));
    }

    //Método que calcula o salário do Funcionario Apoio
    public double CalcSalarioApoio(FuncionariosApoio funcaoApoio) {
        double salario = 0.0;
        String funcaoParsed = funcaoApoio.toString();

        switch (funcaoParsed) {
            case "CAMERA":
                salario = 1100.00;
                break;
            case "ILUMINADOR":
                salario = 950.00;
                break;
            case "CONTRARREGRA":
                salario = 1000.00;
                break;
            case "PRODUTOR":
                salario = 2000.00;
                break;
            case "MAQUIAGEM":
                salario = 1300.00;
                break;
            default:
                System.out.println("Essa profissão não está cadastrada!");
                break;
        }

        return salario;
    }

    //Método que cadastra um Funcionario em uma Cena
    protected void CadastrarFuncionario(Cena newCena, boolean IsFuncionarioPrincipal, String nome, String funcao) {
        if (IsFuncionarioPrincipal) {
            Principal newFuncionarioPrincipal = new Principal();

            newFuncionarioPrincipal.funcaoPrincipal = FuncionariosPrincipal.valueOf(funcao);
            newFuncionarioPrincipal.nome = nome;

            System.out.println("Digite o nome do funcionário:");
            ops = input.next();

            System.out.println("Digite o salário por cena:");
            opd = input.nextDouble();

            System.out.println("Digite o salário por produção:");
            opd2 = input.nextDouble();

            newFuncionarioPrincipal.salario = CalcSalarioPrincipal(ops, opd, opd2);

            newCena.aListFuncionario.add(newFuncionarioPrincipal);
        } else if (!IsFuncionarioPrincipal) {
            Apoio newFuncionarioApoio = new Apoio();

            newFuncionarioApoio.funcaoApoio = FuncionariosApoio.valueOf(funcao);
            newFuncionarioApoio.nome = nome;
            newFuncionarioApoio.salario = CalcSalarioApoio(FuncionariosApoio.valueOf(funcao));

            newCena.aListFuncionario.add(newFuncionarioApoio);
        }
    }

    private String FormatarHorario(String horarioInicio) {
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatter.format(horarioInicio);

        return horaFormatada;
    }

    public void PrintListaProducao(ArrayList<Producao> aListProducao) {
        for (Producao producao : aListProducao) {
            System.out.println("[" + aListProducao.indexOf(producao) + "] - " + producao.nome);
        }
    }

    public double GetValorDespesa(ArrayList<Producao> aListProducao) {
        for (Producao producao : aListProducao) {
            for (Verba verba : ) {
                
            }
        }
    }

    //Main
    public void main(String[] args) {
        System.out.println("Selecione uma opção abaixo:");
        System.out.println("1- Cadastrar Cena");
        System.out.println("2- Criar Programa");
        System.out.println("3- Relatorio Econômico");
        opi = input.nextInt();

        while (opb = false) {
            switch (opi) {
                case 1:
                    Cena newCena = new Cena();
                    Fita newFita = new Fita();

                    System.out.println("Digite a duração da cena: ");
                    opd = input.nextDouble();

                    newCena.duracaoCena = opd;

                    //Cadastra Funcionario na Cena
                    System.out.println("É necessário cadastrar o(s) funcionario(s) que participaram da cena:");
                    System.out.println("O Funcionario a ser cadastrado é um Ator ou Dublê?");
                    opb = input.nextBoolean();

                    System.out.println("Digite o nome do Funcionário: ");
                    ops = input.next();

                    System.out.println("Qual a função deste funcionário?");
                    opsf = input.next();

                    this.CadastrarFuncionario(newCena, opb, ops, opsf);

                    //Cadastra a Cena na Fita
                    double capMinutosTot = 0;
                    System.out.println("É necessário cadastrar a(s) fita(s) aonde a cena foi gravada:");
                    while (newCena.duracaoCena >= capMinutosTot) {
                        System.out.println("Digite o número de série da fita:");
                        ops = input.next();

                        System.out.println("Digite a capacidade da fita:");
                        opd = input.nextDouble();

                        newFita.numSerie = ops;
                        newFita.capMinutos = opd;

                        newCena.aListFita.add(newFita);

                        capMinutosTot += opd;
                    }

                    aListCena.add(newCena);

                    System.out.println("Cena cadastrada com sucesso!");
                    break;
                case 2:
                    Producao newProducao = new ShowBanda();

                    System.out.println("Digite o tipo da produção: [ToUpper[1]- ToLower[0,*]");
                    ops = input.next();

                    switch (ops) {
                        case "Filme":
                            newProducao = new Filme();
                            break;

                        case "Novela":
                            newProducao = new Novela();
                            break;

                        case "Propaganda":
                            newProducao = new Propaganda();
                            break;

                        case "Serie":
                            newProducao = new Serie();
                            break;

                        case "ShowBanda":
                            newProducao = new ShowBanda();
                            break;
                        default:
                            System.out.println("Esse tipo de produção não existe. Abortando execução...");
                            break;
                    }

                    System.out.println("Digite o nome da produção:");
                    ops = input.next();

                    newProducao.nome = ops;

                    System.out.println("Digite o horario de inicio da produção [numeros todos juntos]:");
                    ops = input.next();

                    newProducao.horarioInicio = this.FormatarHorario(ops);
                    
                    System.out.println("");
                    ops
                    );
                    
                    
                    break;

                case 3:
                    System.out.println("Selecione uma produção:");
                    this.PrintListaProducao(aListProducao);
                    opi = input.nextInt();

                    break;
            }

            System.out.println("Você deseja voltar para o menu principal? S/N");
            ops = input.next();

            if (ops.equals("S")) {
                opb = false;
            } else {
                System.out.println("Obrigado por utilizar o sistema.");
                break;
            }
        }
    }
}
