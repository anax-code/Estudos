
package exercicio02;

/**
 *
 * @author Leandro Miguel
 */
public class EstruturaFuncional 
{
    //Atributos
    private int n1,n2;
            
    
    //Construtor

    public EstruturaFuncional(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //Métodos de acesso

    public int getN1() 
    {
        return n1;
    }

    public void setN1(int n1)
    {
        this.n1 = n1;
    }

    public int getN2()
    {
        return n2;
    }

    public void setN2(int n2) 
    {
        this.n2 = n2;
    }
    
    //Métodos de Execução
    public int somaNumeros()
    {
        int y = 0;
        for (int i=0; i<n2; i++)
        {
            y+=n1;
        }
        return y;
    }
    
    public String dados()
    {
        return "O resultado da soma do primeiro numero em relação a n vezes, sendo n o segundo numero é: "+somaNumeros();
        
    }
}
