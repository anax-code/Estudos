
package exercicio17;

/**
 *
 * @author leandro
 */
public class Pessoa
{
    //Atributos 
    private String nome, sexo;
    private int idade;
    
    //Construtor
    
    public Pessoa ()
    {
        
    }

//    public Pessoa(String nome, String sexo, int idade)
//    {
//        this.nome = nome;
//        this.sexo = sexo;
//        this.idade = idade;
//    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    //Métodos Particulares 
    public String voto()
    {
        if (idade < 16)
        {
            return "Proibida de votar!";
        }
        else if (idade >=16 && idade <=17 || idade >=70)
        {
            return "Facultada a voltar!";
        }
        else 
        {
            return "Obrigada a Votar!";
        }
    }
    
    public String alistamento()
    {
        if (sexo == "MASCULINO" && idade >=18)
        {
            return "Obrigatório!";
        }
        else if (sexo == "FEMININO" && idade >=18)
        {
            return "Facultativo!";
        }
        else
        {
            return "Proibido!";   
        }
    }
    
    public String status ()
    {
        return "A pessoa é "+ voto() + "\nE o serviço militar é "+alistamento();   
    }
}
