
package exercicio14;

public class Circulo 
{
    //Atributos
    private float raio;
    
    //Construtor

//    public Circulo(float raio)
//    {
//        this.raio = raio;
//    }
    
    //Métodos de Acesso

    public float getRaio() 
    {
        return raio;
    }

    public void setRaio(float raio)
    {
        this.raio = raio;
    }
    
    //Métodos Particulares
    
   public double areaDoCirculo()
   {
       return Math.PI*Math.pow(raio, 2);
   }
   
   public double perimetroDoCirculo()
   {
       return 2*Math.PI*raio;
   }
   
   public double diametro ()
   {
       return 2*raio;
   }
   
   public String resultados()
   {
       return "\nO Valor do Raio vale: "+ raio+"\nÁrea do Círculo: "+areaDoCirculo()+"\nPerímetro do Círculo: "+ perimetroDoCirculo()+"\nDiametro: "+diametro();  
   }
}
