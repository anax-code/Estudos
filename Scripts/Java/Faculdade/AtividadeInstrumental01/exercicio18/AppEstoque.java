
package exercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class AppEstoque 
{
    public static void main (String args [])
    {
        //Declarando Objeto
        Estoque objEstoque;
        
        //Entrada de Dados
        String descricao = JOptionPane.showInputDialog(null,"Insira a descrição do produto", "App Estoque",3);
        int qtdAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da quantidade atual em estoque","App Produto",3));
        int qtdMin = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor mínimo que pode conter no estoque","App Produto",3));
        
        //Instanciando um novo objeto
        objEstoque = new Estoque(descricao, qtdAtual, qtdMin);
        
        objEstoque.darBaixa(qtdAtual);
        
        if (objEstoque.precisaRepor()==true)
        {
            objEstoque.repor(qtdAtual);
        }
        else
        {
            
            
        }
       
    }
    
}
