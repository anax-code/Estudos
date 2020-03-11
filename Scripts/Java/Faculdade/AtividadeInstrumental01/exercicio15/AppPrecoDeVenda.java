
package exercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class AppPrecoDeVenda 
{
    public static void main (String args [])
    {
       //Entrada de Dados
       
       int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o Tipo do Produto, onde: \n1 = Higiene \n2 = Alimento \n3 = Bebida", "App Produto",1));
       String codigo = JOptionPane.showInputDialog(null,"Insira do código do Produto", "App Produto",1);
       String descricao = JOptionPane.showInputDialog(null,"Insira a Descrição do Produto","App Produto",1);
       double precoDeCusto = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o preço do Produto","App Produto",1));
       
       //Declarando e Instanciando o Objeto
       Produto objProduto = new Produto (codigo, descricao,precoDeCusto, tipo);
       
       //Saída de Dados 
       JOptionPane.showMessageDialog(null,"Tipo: "+objProduto.tipoNome()+"\nO código do Produto é: "+objProduto.getCodigo()+"\nNome do Produto: "+objProduto.getDescricao()+"\nPreço de Custo: R$"+objProduto.getPrecoDeCusto()+"\nPreço de Venda: R$"+objProduto.precoDeVenda(),"App Produto",1);   
    }
}
