/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao1;

/**
 *
 * @author Luciana
 */
public class TesteFuncao1 {

    /**
     * @param args the command line arguments
     */
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma (5,2);
    }
    
}
