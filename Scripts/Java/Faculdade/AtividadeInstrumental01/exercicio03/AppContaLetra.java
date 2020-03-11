package exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro Miguel
 */
public class AppContaLetra 
{
    public static void main (String args [])
    {
        try
        {
            //Declaração do Objeto
        ArmazenandoFrase objArmazenandoFrase;
        
        //Entrada de dados
        String frase = JOptionPane.showInputDialog(null, "Escreva a sua frase");
        String letra = JOptionPane.showInputDialog(null, "Digita a letra a ser contada"); 
        
        //Instanciando o Objeto
        objArmazenandoFrase = new ArmazenandoFrase (frase, letra.charAt(0));
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null,objArmazenandoFrase.qtdLetras());   
        }
        finally
        {
            JOptionPane.showMessageDialog(null,"Encerrando o programa");
            System.exit(0);
        }
    }
}
