
package exercicio06;

import javax.swing.JOptionPane;

public class AppConversaoNumeral
{
    public static void main (String args[])
    {
        try
        {
        //Entrada de Dados
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser convertido para Binário"));
        
        //Declaraçao do Objeto
        CaracteristicasNumerais objCaracteristicasNumerais = new CaracteristicasNumerais(n);
        
        //Sáida de Dados
        JOptionPane.showMessageDialog(null, objCaracteristicasNumerais.convertDB());
        }
        catch (NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Por Favor insira apenas números Inteiros!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            JOptionPane.showMessageDialog(null,"Fim do método");
        }
        
    }
    
}
