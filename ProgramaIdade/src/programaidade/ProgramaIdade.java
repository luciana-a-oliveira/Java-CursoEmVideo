/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Luciana
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2020- nasc;
        System.out.println("Sua idade é " + i + " anos");
        if (i >= 18){
            System.out.println("Você é maior de Idade");
        }else{
            System.out.println("Você é menor de Idade");
        }
        
    }
    
}
