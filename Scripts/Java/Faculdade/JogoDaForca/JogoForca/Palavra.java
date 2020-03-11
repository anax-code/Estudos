/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoForca;

/**
 *
 * @author Leandro Miguel
 */
public class Palavra {
    private String texto ;
    private String dica;

    public Palavra() {
        
    }

    public Palavra(String texto, String dica) {
        this.texto = texto;
        this.dica = dica;
        
    }

    public String getTexto() {
        
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
     
      
    
}
