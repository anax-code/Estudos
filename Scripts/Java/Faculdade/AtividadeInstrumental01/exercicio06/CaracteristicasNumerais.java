
package exercicio06;

public class CaracteristicasNumerais 
{
    //Atributos 
    private int n;
    
    //Construtor

    public CaracteristicasNumerais(int n) 
    {
        this.n = n;
    }
    
    //Método de Acesso

    public int getN()
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }
    
    //Método de Execução
     
    public String convertDB()
    {
        return Integer.toBinaryString(n)+" na base 2";
    }
}
