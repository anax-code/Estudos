
package exercicio08;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class AppTrocaLetra
{
    public static void main (String args [])
    {
        //Declarando objetos 
        InsercaoDaFrase objInsercaoDaFrase;
        
        //Entrada de dados
        String frase = JOptionPane.showInputDialog(null,"Insira a sua frase","App Troca letra S por X", 3);
        
        //Intanciando o Objeto
        objInsercaoDaFrase = new InsercaoDaFrase(frase);
        
        JOptionPane.showMessageDialog(null,objInsercaoDaFrase.busca(), "App Troca a letra S por X",1);
        
        System.exit(0);
    }   
}
