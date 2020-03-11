
package exercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class AppFuncionario
{
    public static void main (String args [])
    {
        //Declarando objeto
        Funcionario objFuncionario;
        
        //Entrada de dados
        String nome = JOptionPane.showInputDialog(null,"Insira o nome do funcionário","App Funcionário",3);
        String matricula = JOptionPane.showInputDialog(null,"Insira a matricula do funcionário","App Funcionário",3);
        String departamento = JOptionPane.showInputDialog(null,"Insira o departamento do funcionário","App Funcionário",3);
        Double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira as horas trabalhadas nesse mês","App Funcionário",3));
        Double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da hora do funcionário","App Funcionário",3));
        
        //Instanciando Objeto
        objFuncionario = new Funcionario(nome, matricula, departamento, horasTrabalhadas,salarioPorHora);
        
        //Saída de Dados 
        JOptionPane.showMessageDialog(null,objFuncionario.dados(),"App Funcionario",1);
    
    }
    
}
