/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Luciana
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        // Exemplo de igualdade diferença de conteúdos iguais
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome2)?"igual":"diferente";
        System.out.println(res); */
        
        /*
        // Exemplo de igualdade diferença de conteúdos iguais
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome3)?"igual":"diferente";
        System.out.println(res); */
        
        
        // Exemplo de como mostrar contrúdos iguais
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
    }
    
}
