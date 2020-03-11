
package exercicio16;

/**
 *
 * @author leandro
 */
public class Funcionario 
{
    //Atributos
    private String nome, matricula, departamento;
    private double horasTrabalhadasNoMes, salarioPorHora;
    private boolean ativo = true;
    
    //Construtores 

    public Funcionario(String nome, String matricula, String departamento, double horasTrabalhadasNoMes, double salarioPorHora)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
        this.salarioPorHora = salarioPorHora;
    }
    
    public Funcionario()
    {
        
    }
    
    //Método de Acesso 

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getDepartamento() 
    {
        return departamento;
    }

    public void setDepartamento(String departamento)
    {
        this.departamento = departamento;
    }

    public double getHorasTrabalhadasNoMes()
    {
        return horasTrabalhadasNoMes;
    }

    public void setHorasTrabalhadasNoMes(double horasTrabalhadasNoMes) 
    {
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }

    public double getSalarioPorHora() 
    {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) 
    {
        this.salarioPorHora = salarioPorHora;
    }

    public boolean isAtivo() 
    {
        return ativo;
    }

    public void setAtivo(boolean ativo) 
    {
        this.ativo = ativo;
    }
    
    //Métodos Particulares
    
    public double calSalarioMensal()
    {
        return salarioPorHora*horasTrabalhadasNoMes;
    }
    
    public double calculaInss()
    {
        if(calSalarioMensal()<=1174.86)
        {
            return (calSalarioMensal()*0.08);
        }
        else if (calSalarioMensal()>=1174.87 && calSalarioMensal()<=1958.10)
        {
            return (calculaInss()*0.09);
        }
        else
        {
            return (calSalarioMensal()*0.11);
        }
    }
    
    public double calculaIr()
    {
        if(calSalarioMensal()<=1566.61)
        {
            return calSalarioMensal();
        }
        else if (calSalarioMensal()>=1566.62&&calSalarioMensal()<=2347.85)
        {
            return calSalarioMensal()*0.075; 
        }
        else if (calSalarioMensal()>=2347.86&&calSalarioMensal()<=3130.51)
        {
            return (calSalarioMensal()*0.15);
        }
        else if (calSalarioMensal()>=3120.52&&calSalarioMensal()<=3911.63)
        {
            return (calSalarioMensal()*0.225);  
        }
        else
        {
            return (calSalarioMensal()*0.275);
        }
    }
    
    public double calculaSalarioLiquido()
    {
        return calSalarioMensal()-calculaInss()-calculaIr();
    }
    
    public void bonificaFuncionario(float horaExtra)
    {
        horasTrabalhadasNoMes = horaExtra;
    }
    
    public void encerraContrato ()
    {
        ativo = false;
    }
    
    public String dados()
    {
        return "Salário do Funcionário: R$"+ calSalarioMensal()+"\nDesconto do Inss: R$"+calculaInss()+"\nDesconto do Imposto de Renda: R$"+calculaIr()+"\nSalário Líquido: R$"+calculaSalarioLiquido();
    }
}
