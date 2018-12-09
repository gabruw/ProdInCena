package prodincena.main;

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
    public FuncionariosApoio opfa;
    public FuncionariosPrincipal opfp;
    public double opd = 0.0;
    public double opd2 = 0.0;
    public boolean opb = false;

    public String tipoProducao = "";

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

        switch (funcaoApoio.toString()) {
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
    protected void CadastrarFuncionario(Cena newCena, boolean IsFuncionarioPrincipal, String nome) {
        if (IsFuncionarioPrincipal) {
            Principal newFuncionarioPrincipal = new Principal();

            System.out.println("Qual a função deste funcionário?");
            opfp = FuncionariosPrincipal.valueOf(input.next().toUpperCase());
                        
            newFuncionarioPrincipal.setFuncaoPrincipal(opfp);
            newFuncionarioPrincipal.setNomePrincipal(nome);

            System.out.println("Digite o salário por cena:");
            opd = input.nextDouble();

            System.out.println("Digite o salário por produção:");
            opd2 = input.nextDouble();

            newFuncionarioPrincipal.setTipo(opfp.toString().toUpperCase());
            newFuncionarioPrincipal.setSalarioPrincipal(CalcSalarioPrincipal(nome, opd, opd2));

            newCena.aListFuncionario.add(newFuncionarioPrincipal);
        } else if (!IsFuncionarioPrincipal) {
            Apoio newFuncionarioApoio = new Apoio();
            
            System.out.println("Qual a função deste funcionário?");
            opfa = FuncionariosApoio.valueOf(input.next().toUpperCase());

            newFuncionarioApoio.setFuncaoApoio(opfa);
            newFuncionarioApoio.setNomeApoio(nome);
            newFuncionarioApoio.setSalarioApoio(CalcSalarioApoio(opfa));
            newFuncionarioApoio.setTipo(opfa.toString().toUpperCase());

            newCena.aListFuncionario.add(newFuncionarioApoio);
        }
    }

    //Cadastra Verba
    private void CadastrarVerba(Producao newProducao, String tipoProducao) {
        opb = false;
        while (opb == false) {
            Verba newVerba = new Verba();

            System.out.println("Digite o tipo da verba: [ToUpper[1] - ToLower[0,*]]");
            ops = input.next();

            if (!(tipoProducao.equals("Filme") || tipoProducao.equals("ShowBanda"))) {
                if (ops.equals("Leis de Incentivo a Cultura")) {
                    System.out.println("Essa verba não está disponível para este tipo de produção e será trocada para 'Venda da Produção'.");
                    ops = "Venda da Produção";
                }
            }

            newVerba.tipo = Patrocinio.valueOf(ops);

            System.out.println("Digite o valor da verba: ");
            opd = input.nextDouble();

            newVerba.valor = opd;

            newProducao.aListVerba.add(newVerba);

            System.out.println("Você deseja cadasrar uma nova verba? S/N");
            ops = input.next();

            if (ops.equals("N")) {
                opb = true;
            }
        }
    }

    private void CadastrarCenasPrograma(ArrayList<Cena> aListCena, Producao newProducao) {
        opb = false;
        while (opb == false) {
            System.out.println("Selecione um Cena da Lista: [index]");

            this.PrintListaCena(aListCena);

            opi = input.nextInt();

            newProducao.aListCena.add(aListCena.get(opi));

            System.out.println("Você deseja cadastrar uma outra cena? S/N");
            ops = input.next();

            if (ops.equals("N")) {
                opb = true;
            }
        }
    }

    private String FormatarHorario(String horarioInicio) {
        SimpleDateFormat formatter1 = new SimpleDateFormat("HHmmss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatter2.format(formatter1.format(horarioInicio));

        return horaFormatada;
    }

    public void PrintListaFita(Cena newCena) {
        for (Fita fita : newCena.aListFita) {
            System.out.println("[" + aListProducao.indexOf(fita) + "] - " + fita.numSerie);
        }
    }

    public void PrintListaCena(ArrayList<Cena> aListCena) {
        for (Cena cena : aListCena) {
            System.out.println("[" + aListProducao.indexOf(cena) + "] - " + cena.duracaoCena);
            System.out.println("[Fitas]");

            this.PrintListaFita(cena);
        }
    }

    public void PrintListaProducao(ArrayList<Producao> aListProducao) {
        for (Producao producao : aListProducao) {
            System.out.println("[" + aListProducao.indexOf(producao) + "] - " + producao.nome);
        }
    }

    public double GetValorVerba(ArrayList<Verba> aListVerba) {
        double valorTot = 0;

        for (Verba verba : aListVerba) {
            valorTot += verba.valor;
        }

        return valorTot;
    }

    public double GetValorFuncionario(ArrayList<Cena> aListCena) {
        double valorTot = 0;

        for (Cena cena : aListCena) {
            for (Funcionario funcionario : cena.aListFuncionario) {
                valorTot += funcionario.salario;
            }
        }

        return valorTot;
    }

    public double GetMinutosGravadas(ArrayList<Cena> aListCena) {
        double valorTot = 0;

        for (Cena cena : aListCena) {
            valorTot += cena.duracaoCena;
        }

        return valorTot * 60;
    }

    public double GetQuantidadeFitas(ArrayList<Cena> aListCena) {
        double valorTot = 0;

        for (Cena cena : aListCena) {
            valorTot += cena.aListFita.size();
        }

        return valorTot;
    }

    public void GetEnvolvidos(ArrayList<Cena> aListCena) {
        for (Cena cena : aListCena) {
            for (Funcionario funcionario : cena.aListFuncionario) {
                switch (funcionario.tipo) {
                    case "ATOR":
                        System.out.println("[Ator]");
                        break;
                    case "DUBLE":
                        System.out.println("[Dublê]");
                        break;
                    case "CAMERA":
                        System.out.println("[Camera]");
                        break;
                    case "ILUMINADOR":
                        System.out.println("[Iluminador]");
                        break;
                    case "CONTRARREGRA":
                        System.out.println("[Contra Regra]");
                        break;
                    case "PRODUTOR":
                        System.out.println("[Produtor]");
                        break;
                    case "MAQUIAGEM":
                        System.out.println("[Maquiagem]");
                        break;
                    default:
                        System.out.println("Essa profissão não está cadastrada!");
                        break;
                }

                System.out.println("Nome: " + funcionario.nome);
                System.out.println("Salario: " + funcionario.salario);
            }
        }
    }

    public double LucroFinal(double verbaTot, double gastoFuncionarioTot) {
        return verbaTot - gastoFuncionarioTot;
    }

    public void Menu() {
        opb = false;
        while (opb == false) {
            System.out.println("Selecione uma opção abaixo:");
            System.out.println("1- Cadastrar Cena");
            System.out.println("2- Criar Programa");
            System.out.println("3- Relatorio Econômico");
            opi = input.nextInt();

            switch (opi) {
                case 1:
                    Cena newCena = new Cena();
                    Fita newFita = new Fita();

                    System.out.println("Digite a duração da cena: ");
                    opd = input.nextDouble();

                    newCena.duracaoCena = opd;

                    opb = false;
                    while (opb == false) {
                        //Cadastra Funcionario na Cena
                        System.out.println("É necessário cadastrar o(s) funcionario(s) que participaram da cena:");
                        System.out.println("O Funcionario a ser cadastrado é um funcionario principal? [true/false]");
                        opb = input.nextBoolean();

                        System.out.println("Digite o nome do Funcionário: ");
                        ops = input.next();

                        System.out.println("Qual a função deste funcionário?");
                        opfa = FuncionariosApoio.valueOf(input.next());

                        CadastrarFuncionario(newCena, opb, ops);

                        System.out.println("Você deseja cadastrar outro funcionario? S/N");
                        ops = input.next();

                        opb = false;

                        if (ops.equals("N")) {
                            opb = true;
                        }
                    }

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
                    //Cadastrar Produção
                    Producao newProducao = new ShowBanda();

                    System.out.println("Digite o tipo da produção: [ToUpper[1] - ToLower[0,*]");
                    ops = input.next();

                    switch (ops) {
                        case "Filme":
                            newProducao = new Filme();
                            tipoProducao = "Filme";
                            break;

                        case "Novela":
                            newProducao = new Novela();
                            tipoProducao = "Novela";
                            break;

                        case "Propaganda":
                            newProducao = new Propaganda();
                            tipoProducao = "Propaganda";
                            break;

                        case "Serie":
                            newProducao = new Serie();
                            tipoProducao = "Serie";
                            break;

                        case "ShowBanda":
                            newProducao = new ShowBanda();
                            tipoProducao = "ShowBanda";
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

                    newProducao.horarioInicio = FormatarHorario(ops);

                    System.out.println("Digite a duração da produção:");
                    opd = input.nextDouble();

                    newProducao.duracao = opd;

                    CadastrarVerba(newProducao, tipoProducao);

                    System.out.println("É necessário selecionar as cenas que copoem a produção:");

                    CadastrarCenasPrograma(aListCena, newProducao);

                    aListProducao.add(newProducao);

                    System.out.println("Produção cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("Selecione uma produção:");

                    PrintListaProducao(aListProducao);
                    opi = input.nextInt();

                    newProducao = aListProducao.get(opi);

                    System.out.println("Lucro Total: ");
                    System.out.print(LucroFinal(GetValorVerba(newProducao.aListVerba), GetValorFuncionario(newProducao.aListCena)));

                    System.out.println("Verba Total: ");
                    System.out.print(GetValorVerba(newProducao.aListVerba));

                    System.out.println("Gasto com os funcionario: ");
                    System.out.print(GetValorFuncionario(newProducao.aListCena));

                    System.out.println("Quantidade de minutos gravadas: ");
                    System.out.print(GetMinutosGravadas(newProducao.aListCena));

                    System.out.println("Quantidade de fitas com gravação: ");
                    System.out.print(GetQuantidadeFitas(newProducao.aListCena));

                    System.out.println("Quantidade de cenas gravadas: ");
                    System.out.print(newProducao.aListCena.size());

                    System.out.println("Tipo, Nome e Salario de cada Funcionario: ");
                    GetEnvolvidos(newProducao.aListCena);
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

    //Main
    public static void main(String[] args) {
        ProdInCena prod = new ProdInCena();
        prod.Menu();
    }
}
