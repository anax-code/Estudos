
package exercicio08;

public class InsercaoDaFrase 
{
    //Atributos
    private String frase;
    
    //Construtor

    public InsercaoDaFrase(String frase) 
    {
        this.frase = frase;
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
    
    //Método de Execução
    
    public String busca()
    {
      String [] letra = {"s"};
      for (String n:letra)
      {
         frase = frase.replaceAll(n,"x");   
      }
       return frase;
    }
}



