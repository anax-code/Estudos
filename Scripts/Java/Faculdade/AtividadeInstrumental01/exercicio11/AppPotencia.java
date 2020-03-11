
package exercicio11;

import javax.swing.JOptionPane;

public class AppPotencia
{
    public static void main (String args [])
    {
        try
        {
            //Declarando o objeto
            Potencia objPotencia;
            
            //Entrada de dados
            float base = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o valor da base do potência", "Potenciação",1));
            int expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do expoente da potência", "potenciação", 1));
            
            //Instanciando o Objeto
            objPotencia = new Potencia(base, expoente);
            
            //Saída de dados 
            JOptionPane.showMessageDialog(null, "O resultado da Potência é: "+ objPotencia.calPotencial());
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Encerrando a Execução",  "Potenciação",1);
            System.exit(0);
        }
    } 
}
