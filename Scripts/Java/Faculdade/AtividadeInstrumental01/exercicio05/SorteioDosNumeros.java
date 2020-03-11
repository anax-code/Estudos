package exercicio05;

import java.util.Random;

public class SorteioDosNumeros 
{
    //Atributos
    
    private int numero = 0;
    private int tentativas = 0;
    
    //Construtor
    public SorteioDosNumeros() 
    {
        this.numero = new Random().nextInt(10);
    }
    
    //Método de acesso
    public int getNumero() 
    {
        return this.numero;
    }

    public int getTentativas() 
    {
        return this.tentativas;
    }   
    
    //Métodos Particulares
    public boolean acertou(int tentativa) 
    {
        this.tentativas++;
        
        
        return this.numero == tentativa;
    }    
}
