package prodincena;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdInCena {
    Scanner input = new Scanner(System.in);
    
    ArrayList<Verba> ListVerba = new ArrayList<>();

    // Cadastra o Patrocinador.
    protected ArrayList<Verba> CadastroPatrocinador(String tipoPrograma){
        Verba newVerba = new Verba();
        
        System.out.println("Digite o Tipo de Patroinador: ");
        String tipo = input.next();
        
        while(tipo.equals("LIC")){
            if(tipoPrograma.equals("FILMES") || tipoPrograma.equals("SHOWS_BANDAS")){
                newVerba.tipo = tipo;
            }else{
                System.out.println("O Tipo 'LIC' só pode ser utilizado para Filmes ou Shows de Bandas!");
                
                System.out.println("Digite o Tipo de Patroinador: ");
                tipo = input.next();
            }
        }
        
        System.out.println("Digite o Valor investido pelo Patroinador: ");
        newVerba.valor = input.nextDouble();
        
        ListVerba.add(newVerba);
        
        return ListVerba;
    }
    
    // Retorna o valor total de Verba disponível.
    protected double VerbaTotal(ArrayList<Verba> ListVerba){
        double verbaTot = 0;
        
        for(Verba verba : ListVerba){
            verbaTot += verba.valor;
        }
        
        return verbaTot;
    }
    
    public static void main(String[] args) {
        
    }
}