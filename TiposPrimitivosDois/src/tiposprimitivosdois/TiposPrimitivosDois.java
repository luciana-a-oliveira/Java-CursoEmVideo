/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivosdois;

import java.util.Scanner;

/**
 *
 * @author Luciana
 */
public class TiposPrimitivosDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o nome do funcioário:");
         String nome = teclado.nextLine();
         System.out.print("Digite a nota da avaliação do funcionário:");
         float nota = teclado.nextFloat();
         System.out.print("Digite a idade do funcionário:");
         int idade = teclado.nextInt();
         System.out.print("Digite o salário do funcionário:");
         float salario = teclado.nextFloat();
         System.out.printf ("A nota de %s é %.2f \n", nome, nota);
        
    }
    
}
