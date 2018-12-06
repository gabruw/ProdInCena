package prodincena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import prodincena.funcionarios.Apoio;
import prodincena.funcionarios.Funcionario;
import prodincena.funcionarios.FuncionariosApoio;
import prodincena.funcionarios.FuncionariosPrincipal;
import prodincena.funcionarios.Principal;

public class ProdInCena {
    Scanner input = new Scanner(System.in);
    
    ArrayList<Verba> aListVerba = new ArrayList<>();
    ArrayList<Cena> aListCena = new ArrayList<>();
    

    public int op = 0;
    public String ops = "";
    public String opsf = "";
    public double opd = 0.0;
    public boolean opb = false;
    
    public double CalcSalario(int numCenas, int numProducao, double salario)
    {
        salario = (numCenas * salario) + (numProducao * salario);
        
        return salario;
    }
    
    public double CalcSalario(FuncionariosApoio funcaoApoio)
    {
        double salario = 0.0;
        String funcaoParsed = funcaoApoio.toString();
        
        switch(funcaoParsed)
        {
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
    
    protected void CadastrarFuncionario(Cena newCena, boolean IsFuncionarioPrincipal, String nome, String funcao)
    {
        if(IsFuncionarioPrincipal)
        {
            Principal newFuncionarioPrincipal = new Principal();
           
            newFuncionarioPrincipal.funcaoPrincipal = FuncionariosPrincipal.valueOf(funcao);
            newFuncionarioPrincipal.nome = nome;
            
            newCena.aListFuncionario.add(newFuncionarioPrincipal);
        }
        else if(!IsFuncionarioPrincipal)
        {
            Apoio newFuncionarioApoio = new Apoio();
            
            double salario = CalcSalario(FuncionariosApoio.valueOf(funcao));
            
            newFuncionarioApoio.funcaoApoio = FuncionariosApoio.valueOf(funcao);
            newFuncionarioApoio.nome = nome;
            newFuncionarioApoio.salario = salario;
            
            newCena.aListFuncionario.add(newFuncionarioApoio);
        }
    }
    
    public void main(String[] args) {
        System.out.println("Selecione uma opção abaixo:");
        System.out.println("1- Cadastrar Cena");
        System.out.println("2- Criar Programa");
        op = input.nextInt();
        
        switch(op)
        {
            case 1:
                Cena newCena = new Cena(); 
                Fita newFita = new Fita();
                
                System.out.println("Digite a duração da cena: ");
                opd = input.nextDouble(); 
                
                newCena.duracaoCena = opd;
                
                System.out.println("É necessário cadastrar o(s) funcionario(s) que participaram da cena:");
                System.out.println("O Funcionario a ser cadastrado é um Ator ou Dublê?");
                opb = input.nextBoolean();
                
                System.out.println("Digite o nome do Funcionário: ");
                ops = input.next();
                
                System.out.println("Qual a função deste funcionário?");
                opsf = input.next();
                
                this.CadastrarFuncionario(newCena, opb, ops, opsf, opd);
                
                double capMinutosTot = 0;
                while(newCena.duracaoCena >= capMinutosTot)
                {   
                    System.out.println("É necessário cadastrar a(s) fita(s) aonde a cena foi gravada:");
                    System.out.println("Digite o numero de série da fita:");
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
                
                break;
        }
        
    }

}