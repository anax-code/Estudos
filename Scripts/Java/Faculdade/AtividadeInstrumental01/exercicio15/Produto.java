
package exercicio15;

public class Produto
{
    private String codigo,descricao;
    private double precoDeCusto;
    private int tipo;

    //Construtores
    public Produto (String codigo, String descricao, double precoDeCusto, int tipo)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoDeCusto = precoDeCusto;
        this.tipo = tipo;
    }
    
    public Produto ()
    {
        
    }
    
    //Métodos de Acesso
    
    public String getCodigo()
    {
        return codigo;
    }
    
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public void setPrecoDeCusto (double precoDeCusto)
    {
        this.precoDeCusto = precoDeCusto;
    }
    
    public double getPrecoDeCusto()
    {
        return precoDeCusto;  
    }
    
    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }
    
    public int getTipo()
    {
        return tipo;
    }

    
    //Métodos Particulares
    
    public double precoDeVenda()
    {
        if (tipo == 1)
        {
            return (precoDeCusto*0.65)+precoDeCusto;
            
        }
        else if (tipo == 2)
        {
            return (precoDeCusto*0.82)+precoDeCusto;
            
        }
        else if (tipo == 3)
        {
            return (precoDeCusto*1.10)+precoDeCusto;
        }
        else
        {
            return 0;
        }
    }
    
    public String tipoNome()
    {
        if (tipo == 1)
        {
            return "Higiene";
        }
        else if (tipo == 2)
        {
            return "Alimento";
        }
        else if (tipo == 3)
        {
            return "Bebida";
        }
        else 
        {
            return "Por favor Insira um número válido";
        }
    }
    
}
