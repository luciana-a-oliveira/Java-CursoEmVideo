/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita4;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciana
 */
public class ExercicioRepita4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int media, num, soma = 0;
        int totVal = 0;
        int nPar = 0;
        int nImpar = 0;
        int acimaDeCem = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Entre com um número: <br><em>[O valor 0 interrmpe]</></html>"));
            soma += num;
            if(num % 2 == 0){
                nPar++;
            }else {
                nImpar++;
            }
            if(num > 100){
                acimaDeCem++;
            }
            if(num != 0){
                totVal++;
            }
        }while(num != 0);
        media = soma / totVal;
        //Saida dos valores
        JOptionPane.showMessageDialog(null, "<html>---------------------------------"
                + "<br>Resultado <br> ---------------------------------" 
                + "<br>Total dos valores: "+ totVal + "<br>"  
                + "Total de números pares: " + nPar + "<br>" 
                + "Total de números Impares: " + nImpar + "<br>" 
                + "Números acima de 100: " + acimaDeCem + "<br>" 
                + "Média dos valores: " + media + "<br>"  
                + "---------------------------------</html>");
    }
    
}
