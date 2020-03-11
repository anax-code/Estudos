
package exercicio04;

/**
 *
 * @author Leandro Miguel
 */
public class inserirNumeros 
{
    //Atributos
    private int n;
    
    //Construtor

    public inserirNumeros( int n)
    {
        
        this.n = n;
    }
    
    //Métodos de Acesso


    public int getn()
    {
        return n;
    }

    public void setn(int n) 
    {
        this.n = n;
    }
    
    //Métodos Principais
    
    public String metodoFibonacci()
    {
        int a=1;
        int b=0;
        int c; 
        String resultado = " ";
        for (int i=0; i<=n; i++)
        {
            c=a;
            a=a+b;
            b=c;
            resultado = resultado+c+" ";
        }
        return resultado;
    }
}
