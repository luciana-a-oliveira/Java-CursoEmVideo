/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor06;

import java.util.Arrays;

/**
 *
 * @author Luciana
 */
public class Vetor06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        Arrays.fill(v, 5);
        for (int valor: v){
            System.out.print(valor + " ");
        }
        
    }
    
}
