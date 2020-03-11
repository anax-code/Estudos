
package contacorrente;

public class Pessoa
{
    //Atributos
    private String nome, sobreNome;
    
    //Construtores
    public Pessoa (String nome, String sobreNome)
    {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }
    
    public Pessoa ()
    {
        
    }
    
    //Métodos de Acesso

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSobreNome()
    {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome)
    {
        this.sobreNome = sobreNome;
    }
    
    //Métodos Particulares 
    public String nomeCompleto()
    {
        return nome+sobreNome;
    }
}
