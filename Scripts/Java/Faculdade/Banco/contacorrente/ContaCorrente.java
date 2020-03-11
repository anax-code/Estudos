
package contacorrente;

public class ContaCorrente 
{
    //Atributos
    private String numeroDaConta;
    private double saldo;
    private Pessoa titular; //Aqui vou chamar a classe Pessoa que contém o nome e sobrenome.
    
    //Construtor
    public ContaCorrente (String numero, Pessoa titular)
    {
        this.numeroDaConta = numero;
        this.titular = titular;
        this.saldo = 0;
        
    }
    
    //Métodos de Acesso

    public String getNumeroDaConta() 
    {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) 
    {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo()
    {
        return saldo;
    }
    
    public Pessoa getTitular() 
    {
        return titular;
    }

    public void setTitular(Pessoa titular)
    {
        this.titular = titular;
    }

    //Métodos Particulares
    public void deposito(float valor)
    {
        saldo+=valor;
    } 
    
    public boolean saque( float valor)
    {
        if(saldo>=valor)
        {
          saldo-=valor;
          return true;
        }
        else
        {
            return false; 
        }    
    } 
}
