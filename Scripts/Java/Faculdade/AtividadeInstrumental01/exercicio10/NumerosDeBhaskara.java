
package exercicio10;


public class NumerosDeBhaskara 
{
    //Atributos
    private int a,b,c;
 
    
    //Métodos de acesso

    public int getA() 
    {
        return a;
    }

    public void setA(int a) 
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC() 
    {
        return c;
    }

    public void setC(int c) 
    {
        this.c = c;
    }
    
    //Métodos Gerais
    
    public float calculaDelta()
    {
       return (float)Math.pow(b, 2)-(4*a*c);   
    }    
    
    public String raizes()
    {
        if(calculaDelta()<0)
        {
            return "Raiz(es) Negativa(s)!!! Por favor, escreva outros valores";
        }
        else
        {
            return "x1 = "+((-b+Math.sqrt(calculaDelta()))/2*a)+"\nx2= "+((-b-Math.sqrt(calculaDelta()))/2*a);
        }
    }
}
