
package exercicio12;

public class Imovel
{
    //Atributos
    private String identificacao;
    private double valorDoImposto, multa;
    private int mesesAtrasado;
    
    //Métodos de Acesso

    public String getIdentificacao() 
    {
        return identificacao;
    }

    public void setIdentificação(String identificação)
    {
        this.identificacao = identificação;
    }

    public double getValorDoImposto()
    {
        return valorDoImposto;
    }

    public void setValorDoImposto(double valorDoImposto)
    {
        this.valorDoImposto = valorDoImposto;
    }
    
    public int getMesesAtrasado() 
    {
        return mesesAtrasado;
    }

    public void setMesesAtrasado(int mesesAtrasado)
    {
        this.mesesAtrasado = mesesAtrasado;
    }

    //Métodos Particulares
    
    public double jurosComposto()
    {
        return multa = valorDoImposto*(Math.pow((1+0.02),mesesAtrasado));
    }
    
    public String dados()
    {
        return "Identificação do Imóvel: "+identificacao+"\nValor do Imposto: R$"+valorDoImposto+"\nMeses em atraso: "+mesesAtrasado+"\nMulta a ser paga: R$"+jurosComposto(); 
    }
}
