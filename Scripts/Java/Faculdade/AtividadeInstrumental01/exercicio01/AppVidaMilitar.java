
package exercicio01;

import javax.swing.JOptionPane;

/**
 * @author Leandro Miguel
 */
public class AppVidaMilitar
{
    public static void main (String args [])
    {
        try
        {
            //Declaração de Objeto
            CaracteristicasDoCandidato objCaracteristicasDoCandidato;
        
            //Entrada de Dados
            String nome = JOptionPane.showInputDialog(null, "Insira o nome do candidato","Aplicativo Militar",3);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do candidato", "Aplicativo Militar",3));
            String sexo = JOptionPane.showInputDialog(null, "Insira o sexo do candidato", "Aplicativo Militar", 3);
        
            //Instanciação do Objeto
            objCaracteristicasDoCandidato = new CaracteristicasDoCandidato(sexo, nome, idade);
        
            //Saída de Dados
            JOptionPane.showMessageDialog(null,objCaracteristicasDoCandidato.dados(),"Aplicativo Militar",1);
        }
        finally 
        {
            JOptionPane.showMessageDialog(null,"Encerrando a execução","Aplicativo Militar",1);
        }
    }
}
