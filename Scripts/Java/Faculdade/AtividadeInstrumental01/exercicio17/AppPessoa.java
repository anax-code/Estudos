
package exercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */

public class AppPessoa
{
    public static void main (String args [])
    {
        //Declarando um objeto e Instanciando um novo Objeto
        Pessoa objPessoa = new Pessoa();
        
        //Estrutura de Escolha 
        String sexo [] = {"MASCULINO", "FEMININO"};
        String opUser = "";
        
        //Estrutura de Repetição com Entrada e Saída de Dados 
        while (!opUser.equalsIgnoreCase("Sair"))
        {
            opUser = (String)JOptionPane.showInputDialog(null,"Escolha o Sexo ", "App Pessoa", 3, null, sexo,sexo[0]);
            objPessoa.setSexo(opUser);
            
            if(opUser.equalsIgnoreCase(sexo[0]))
            {
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da Pessoa", "App Pessoa",3));
                objPessoa.setIdade(idade);
                JOptionPane.showMessageDialog(null, objPessoa.status(),"App Pessoa",1);
            }
            else
            {
                int idade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da Pessoa", "App Pessoa",3)); 
                objPessoa.setIdade(idade2);
                JOptionPane.showMessageDialog(null, objPessoa.status(),"App Pessoa",1);
            } 
        }
    }
}
