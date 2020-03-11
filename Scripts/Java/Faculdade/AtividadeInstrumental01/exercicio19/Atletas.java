
package exercicio19;

/**
 *
 * @author leandro
 */
public class Atletas
{
    //Atributos
    private String nome, sexo;
    private int idade;
    private float altura;
    
    //Construtores 

    public Atletas(String nome, String sexo, int idade, float altura) 
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }
    
    public Atletas()
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

    public float getAltura() 
    {
        return altura;
    }

    public void setAltura(float altura) 
    {
        this.altura = altura;
    }
    
    //Métodos Particulares
    public String categoria()
    {
        if(idade<11)
        {
            return "Infantil.";
        }
        else if (idade >11 && idade <15)
        {
            return "Infanto-Juvenil.";
        }
        else if (idade>=15 && idade <18)
        {
            return "Juvenil.";
        }
        else if (idade >=18 && idade < 50)
        {
            return "Adulto.";
        }
        else if (idade >=50 && idade <60)
        {
            return "Master.";
        }
        else
        {
            return "Senior.";
        }
    }
    
    public float pesoIdeal()
    {
        if(sexo=="Masculino")
        {
            return (float) ((72.7*altura)-58);
        }
        else
        {
            return (float)((62.1*altura)-44.7);
        }
    }
    public String status()
    {
        return "\nCategoria Oficial: "+categoria()+"\nPeso Ideal: "+pesoIdeal()+" Kg";
    }
}
