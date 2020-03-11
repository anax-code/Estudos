package exercicio11;

public class Potencia 
{
    //Atributos
    private float base;
    private int expoente;
    
    //Construtor

    public Potencia(float base, int expoente)
    {
        this.base = base;
        this.expoente = expoente;
    }
    
    //Métodos de Acesso

    public float getBase() 
    {
        return base;
    }

    public void setBase(float base) 
    {
        this.base = base;
    }

    public int getExpoente() 
    {
        return expoente;
    }

    public void setExpoente(int expoente)
    {
        this.expoente = expoente;
    }
    
    //Métodos Particulares
    
    public double calPotencial()
    {
        return Math.pow(base, expoente);  
    }
}
