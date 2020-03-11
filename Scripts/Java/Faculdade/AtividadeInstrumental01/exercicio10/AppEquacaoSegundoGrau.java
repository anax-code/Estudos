package exercicio10;

import javax.swing.JOptionPane;

public class AppEquacaoSegundoGrau
{
    public static void main (String args [])
    {
       try
       {
           
           //Instanciação do Objeto
           NumerosDeBhaskara objNumerosDeBhaskara = new NumerosDeBhaskara();
           
           int opUser;
           
           do
            {
                //Entrada de Dados
                int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro termo da equação","Equação de Bhaskara",1));
                objNumerosDeBhaskara.setA(a);
           
                int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo termo da equação","Equação de Bhaskara",1));
                objNumerosDeBhaskara.setB(b);
           
                int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro termo da equação", "Equação de Bhaskara", 1));
                objNumerosDeBhaskara.setC(c);
           
                //Saída de Dados
                JOptionPane.showMessageDialog(null,"As Raízes da Equação de Segundo grau são: " + objNumerosDeBhaskara.raizes());
           
                opUser=JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?","Equação de Bhaskara",JOptionPane.YES_NO_OPTION,3);
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
