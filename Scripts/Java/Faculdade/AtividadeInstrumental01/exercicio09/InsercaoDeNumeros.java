
package exercicio09;

public class InsercaoDeNumeros 
{
    //Atributos
    private int n1,n2,n3;
    
    //Método de Acesso

    public int getN1()
    {
        return n1;
    }

    public void setN1(int n1) 
    {
        this.n1 = n1;
    }

    public int getN2() 
    {
        return n2;
    }

    public void setN2(int n2) 
    {
        this.n2 = n2;
    }

    public int getN3() 
    {
        return n3;
    }

    public void setN3(int n3)
    {
        this.n3 = n3;
    }
    
    //Método Geral
    public int maiorNumero()
    {
        if(n1>n2&&n1>n3)
        {
            return n1;
        }
        else if(n2>n1&&n2>n3)
        {
            return n2;
        }
        else
        {
            return n3;
        }
    }
    
    public int menorNumero()
    {
        if(n1<n2&&n1<n3)
        {
            return n1;
        }
        else if(n2<n1&&n2<n3)
        {
            return n2;
        }
        else
        {
            return n3;
        }
    }
    public String ordem()
    {
        if (n1>n2&&n1>n3&&n2>n3)
        {
            return n1+""+n2+""+n3;
        }
        else if (n1>n2&&n1>n3&&n3>n2)
        {
            return n1+""+n3+""+n2;
        }
        else if (n2>n1&&n2>n3&&n1>n3)
        {
            return n2+""+n1+""+n3;
        }
        else if (n2>n1&&n2>n3&&n3>n1)
        {
            return n2+""+n3+""+n1;
        }
        else if (n3>n1&&n3>n2&&n2>n1)
        {
            return n3+""+n2+""+n1;
        }
        else
        {
            return n3+""+n1+""+n2;
        }
    }
    public int somaNumeros()
    {
        return n1+n2+n3;
    }
    public int multiplicaNumeros()
    {
        return n1*n2*n3;
    }
    public String somaOuProduto()
    {
        if(n1%2==0&&n2%2==0&&n3%2==0)
        {
            return "A Soma dos números é: " + somaNumeros();
        }
        else if (n1%2==0&&n2%2==0&&n3%2==1)
        {
            return "A Soma dos números é: " + somaNumeros();
        }
           
        else if (n1%2==0&&n2%2==1&&n3%2==0)
        {
            return "A Soma dos números é: " + somaNumeros();
        }
        else if (n1%2==1&&n2%2==0&&n3%2==0)
        {
            return "A soma dos números é: "+somaNumeros();   
        }
        else if (n1%2==1&&n2%2==1&&n3%2==0)
        {
         return "O Produto dos números é: " + multiplicaNumeros();
        }
        else if (n1%2==0&&n2%2==1&&n3%2==1)
        {
         return "O Produto dos números é: " + multiplicaNumeros();
        }
        else if (n1%2==0&&n2%2==0&&n3%2==1)
        {
         return "O Produto dos números é: " + multiplicaNumeros();
        }
        else
        {
            return "O Produto dos números é: " +multiplicaNumeros();
        }
    }
}
