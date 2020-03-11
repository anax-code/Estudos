
package exercicio12;

import javax.swing.JOptionPane;

public class AppImovel 
{
    public static void main (String args [])
    {
        try
        {
        //Instanciando o objeto
        Imovel objImovel = new Imovel();
        
        int opUser;
        
        do
        {
            //Entrada de Dados
            String identificacao = JOptionPane.showInputDialog(null, "Insira a identificação do Imóvel", "Imposto sobre o imóvel", 3);
            objImovel.setIdentificação(identificacao);
        
            double valorDoImposto = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do Imposto do Imóvel", "Imposto sobre o imóvel",3));
            objImovel.setValorDoImposto(valorDoImposto);
        
            int mesesAtrasado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira os meses em atraso", "Imposto sobre o imóvel", 3));
            objImovel.setMesesAtrasado(mesesAtrasado);
        
            //Saída de Dados
            JOptionPane.showMessageDialog(null,objImovel.dados(), "Imposto sobre Imóvel",1);
            
            opUser=JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?","Equação de Bhaskara",JOptionPane.YES_NO_OPTION,3);
        }
        while (opUser == 0);
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
