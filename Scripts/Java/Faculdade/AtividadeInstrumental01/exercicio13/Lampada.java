
package exercicio13;

public class Lampada
{
    //Atributos 
    private boolean estadoDaLampada;
    
    //Métodos de Acesso

    public boolean getEstadoDaLampada() 
    {
        return estadoDaLampada;
    }

    public void setEstadoDaLampada(boolean estadoDaLampada) 
    {
        this.estadoDaLampada = estadoDaLampada;
    }
    
    //Métodos Particulares
            
    public String mostraEstado()
    {
        if(estadoDaLampada==true)
        {
            return "A lâmpada esta acesa!";
        }
        else 
        {
            return "A lâmpada esta apagada!"; 
        }
    }
}
