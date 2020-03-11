package exercicio07;

public class CaracteristicasCarro
{
    //Atributos
    private String marca, modelo, cor, combustivel;
    private int ano;
    double precoDeCusto;
    
    //Contrutores

    public CaracteristicasCarro(String marca, String modelo, String cor, String combustivel, int ano, double precoDeCusto)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ano = ano;
        this.precoDeCusto = precoDeCusto;
    }

    public CaracteristicasCarro()
    {
        
    }
 
    //Métodod de Acesso

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getCombustivel()
    {
        return combustivel;
    }

    public void setCombustivel(String combustivel)
    {
        this.combustivel = combustivel;
    }

    public int getAno() 
    {
        return ano;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    public double getPrecoDeCusto() 
    {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(double precoDeCusto) 
    {
        this.precoDeCusto = precoDeCusto;
    }
    
    //Métodos de Execução
    public String informacoesCarro()
    {
        return "Marca: "+marca+"\nModelo "+modelo+"\nAno: "+ano+"\nCor: "+cor+"\nCombustível: "+combustivel+"\nPreço de Custo: "+precoDeCusto;
    }
    
    public double quantoCusta()
    {
        if(combustivel=="GASOLINA")
        {
            return (precoDeCusto*5/100)+precoDeCusto;
            
        }
        else if (combustivel == "ALCOOL")
        {
            return (precoDeCusto*7/100)+precoDeCusto; 
        }
        else if (combustivel == "DIESEL")
        {
            return (precoDeCusto*15/100)+precoDeCusto;
        }
        else if (combustivel == "GNV")
        {
            return (precoDeCusto*3/100)+precoDeCusto;
        }
        else
        {
            return (precoDeCusto*10/100)+precoDeCusto;   
        }
    }
}
