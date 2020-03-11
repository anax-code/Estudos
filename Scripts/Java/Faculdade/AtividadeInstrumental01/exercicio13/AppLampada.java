
package exercicio13;

import javax.swing.JOptionPane;

public class AppLampada 
{
    public static void main (String [] args)
    {
        try
        {
            //Declarando e Instanciando o Objeto
            Lampada objLampada = new Lampada();
            
            //Estrutura de escolha 
            String acionamento [] = {"Acender","Apagar"};
            String opUser="";
            
            while(!opUser.equalsIgnoreCase("Sair"))
            {
                opUser = (String)JOptionPane.showInputDialog(null,"O que deseja fazer com a lâmpada? ", "App Lâmpada", 3, null, acionamento,acionamento[0]);
                
                if (opUser.equalsIgnoreCase(acionamento[0]))
                {
                    objLampada.setEstadoDaLampada(true);
                } 
                else 
                {
                    objLampada.setEstadoDaLampada(false);
                    
                }
                JOptionPane.showMessageDialog(null, objLampada.mostraEstado(),"App Lâmpada",1);
            }  
        }      
        catch (NullPointerException erro)
        {
            JOptionPane.showMessageDialog(null,"Tecla Cancelar pressionada\n", "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);       
        }
        finally 
        {
            JOptionPane.showMessageDialog(null, "Final da execução!");
        }
        System.exit(0);
    }
}
