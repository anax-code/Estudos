package exercicio03;
/**
 *
 * @author Leandro Miguel
 */
public class ArmazenandoFrase
{
    //Atributos
    private String frase;
    private char letra;
    private int qtd = 0;
    
    //Construtor

    public ArmazenandoFrase(String frase, char letra)
    {
        this.frase = frase;
        this.letra = letra;
    }
    
    //Método de Acesso

    public String getFrase()
    {
        return frase;
    }

    public void setFrase(String frase)
    {
        this.frase = frase;
    }

    public char getLetra() 
    {
        return letra;
    }

    public void setLetra(char letra)
    {
        this.letra = letra;
    }
    
    //Método Geral
    
    public int qtdFrase()
    {
        return frase.length();
    }
    public int qtdLetras()
    {
        for(int i=0; i<qtdFrase(); i++)
        {
            if(frase.charAt(i)==letra)
            {
            qtd++;
            }
        }
        return qtd;
    }
}
