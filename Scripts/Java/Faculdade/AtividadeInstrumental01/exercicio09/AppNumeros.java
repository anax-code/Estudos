
package exercicio09;

import javax.swing.JOptionPane;

public class AppNumeros
{
    public static void main (String args [])
    {
        try
        {
            //Instanciação do Objeto
            InsercaoDeNumeros objInsercaoDeNumeros = new InsercaoDeNumeros();
        
            int opUser;
        
            do
            {
                //Entrada de Dados
                int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Primeiro numero"));
                objInsercaoDeNumeros.setN1(n1);
            
                int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Segundo numero"));
                objInsercaoDeNumeros.setN2(n2);
            
                int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Terceiro numero"));
                objInsercaoDeNumeros.setN3(n3);
            
                //Saída de Dados
                JOptionPane.showMessageDialog(null,"O Maior Número é: " + objInsercaoDeNumeros.maiorNumero());
                JOptionPane.showMessageDialog(null,"O Menor Número é: " + objInsercaoDeNumeros.menorNumero());
                JOptionPane.showMessageDialog(null,"A Ordem dos Números do Maior para Menor é: "+ objInsercaoDeNumeros.ordem());
                JOptionPane.showMessageDialog(null,objInsercaoDeNumeros.somaOuProduto());
            
                opUser=JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?","Numeros",JOptionPane.YES_NO_OPTION,3);  
            
            }
             while (opUser == 0);  
        }
        catch (NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro de Conversão!\n", "Erro", JOptionPane.ERROR_MESSAGE);
        }    
        finally
        {
            JOptionPane.showMessageDialog(null,"Fim da Execução");
            System.exit(0);
        }
    }
}
