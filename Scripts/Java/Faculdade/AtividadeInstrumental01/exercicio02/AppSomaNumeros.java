
package exercicio02;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro Miguel
 */
public class AppSomaNumeros
{
    public static void main (String args [])
    {
        //Declaração do Objeto
        EstruturaFuncional objEstruturaFuncional;
        
        //Entrada de dados
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Primeiro número", "App Soma Numeros ao invés de multiplicar",3));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo número", "App Soma Numeros ao invés de multiplicar",3));
        
        //Instanciação do Objeto
        objEstruturaFuncional = new EstruturaFuncional(n1, n2);
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null,objEstruturaFuncional.dados());
    }
}
