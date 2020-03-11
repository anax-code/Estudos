
package exercicio14;

import javax.swing.JOptionPane;

public class AppCirculo 
{
    public static void main (String args [])
    {
        try
        {
           
           //Instanciação do Objeto
           Circulo objCirculo = new Circulo();
           
           int opUser;
           
             do
            {
                //Entrada de Dados
                float raio = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do Raio","App Circulo",1));
                objCirculo.setRaio(raio);
           
           
                //Saída de Dados
                JOptionPane.showMessageDialog(null,"Os resultados são: " + objCirculo.resultados());
           
                opUser=JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?","App Círculo",JOptionPane.YES_NO_OPTION,3);
            }
             while (opUser==0);
        } 
       catch (ArithmeticException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException erro)
        {
            JOptionPane.showMessageDialog(null,"Tecla Cancel pressionada\n"+ erro.toString(), "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);       
        }
        finally 
        {
            JOptionPane.showMessageDialog(null, "Final da execução!");
        }
        System.exit(0);
    }
    
}
