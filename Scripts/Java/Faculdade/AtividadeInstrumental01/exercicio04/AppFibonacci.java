package exercicio04;

import javax.swing.JOptionPane;

/**
 * @author Leandro Miguel
 */
public class AppFibonacci 
{
    public static void main (String args [])
    {
        //Declarando Objetos
        inserirNumeros objinserirNumeros;
        
        //Entrada de Dados
       
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o termo limite para a aplicação do Fibonacci"));
        
        //Instanciando o Objeto
        objinserirNumeros = new inserirNumeros(n);
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, objinserirNumeros.metodoFibonacci());
    }
}
