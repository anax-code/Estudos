
package exercicio01;

/*
 * @author Leandro Miguel;
 */
public class CaracteristicasDoCandidato 
{
    //Atributos
    private String sexo, nome;
    private int idade;
    
    //Construtor

    public CaracteristicasDoCandidato(String sexo, String nome, int idade) 
    {
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
    }
    
    //Métodos de acesso

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    //Métodos de Execução
    
    public String situacao()
    {
        if (idade>=18)
        {
            return "Apto ao serviço militar";
        }
        else
        {
            return "Inapto ao serviço militar";
        }
        
    }
    public String dados()
    {
        return "Nome: "+ nome + "\nIdade: "+idade+ "\nSexo: " + sexo +"\nResultado: " + "Você está " +situacao();
    }
}
