package folhadepagamentocomherança;

public class Empregado
{
    //Atributos
    protected String matricula;
    protected String nome;
    protected String cpg;
    protected float salario;
    
    //Construtor

    public Empregado(String matricula, String nome, String cpg) 
    {
        this.matricula = matricula;
        this.nome = nome;
        this.cpg = cpg;
    }

    public Empregado(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    //Métodos de Acesso

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpg()
    {
        return cpg;
    }

    public void setCpg(String cpg)
    {
        this.cpg = cpg;
    }
    
    public float getSalario() 
    {
        return salario;
    }
    
    
    //Método Particulares
    public float inss()
    {
        return salario*8/100;
    }

}
