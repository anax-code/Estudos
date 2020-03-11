
package exercicio18;
/**
 *
 * @author leandro
 */
public class Estoque 
{
    //Atributos 
    private String descricao;
    private int qtdAtual, qtdMinima;
    
    //Construtores
    public Estoque(String descricao, int qtdAtual, int qtdMinima)
    {
        this.descricao = descricao;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() 
    {
        
    }
    
    //Métodos de Acesso

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getQtdAtual() 
    {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) 
    {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima()
    {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) 
    {
        this.qtdMinima = qtdMinima;
    }
    
    //Métodos Particulares
    
    public void repor(int qtd)
    {
        qtdAtual += qtd;
    }
    
    public void darBaixa (int qtd)
    {
        qtdAtual-=qtd;
    }
    
    public String dados()
    {
        return "Nome do produto: "+descricao+"\nQuantidade mínima: "+qtdMinima+"\nQuantidade atual: "+qtdAtual;
    }
    
    public boolean precisaRepor()
    {
        if(qtdAtual<=qtdMinima)
        {
            return true;
        }   
        else
        {
            return false;
        }
    }  
}
