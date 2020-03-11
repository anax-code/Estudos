
package contacorrente;

import javax.swing.JOptionPane;

public class AppBank 
{
    public static void main (String args [])
    {
        //Declarando Objeto
        ContaCorrente objMinhaConta;
        
        //Entrada de Dados
        String nome = JOptionPane.showInputDialog(null, "Insira o nome do Titular", "App Bank",3);
        String sobreNome = JOptionPane.showInputDialog(null, "Insira o sobrenome do titular", "App Bank",3);
        String numeroDaConta = JOptionPane.showInputDialog(null, "Insira o número da conta do titular", "App Bank",3);
        
        objMinhaConta = new ContaCorrente (numeroDaConta,new Pessoa(nome,sobreNome)); 
        //ou Pessoa titular = new Pessoa(nome,sobrenome);
        
        //Estrutura de escolha
        String operacoes[]={"Saldo","Saque","Depósito","Sair"};
        String opUsr ="";
        
        while(!opUsr.equalsIgnoreCase("Sair"))
        {
            
            opUsr = (String)JOptionPane.showInputDialog(null,"Selecione a operação desejada: ", "App Bank", 3, null, operacoes,operacoes[0]);
        
            if(opUsr.equals(operacoes[0]))
            {
                JOptionPane.showMessageDialog(null,"Conta n: "+objMinhaConta.getNumeroDaConta()+"\nTitular: "+objMinhaConta.getTitular()+"\nSaldo: "+objMinhaConta.getSaldo(),"App Bank",1);
            }
            else if (opUsr.equals("Depósito"))
            {
                float valorDep=Float.parseFloat(JOptionPane.showInputDialog(null,"Valor a ser depositado","App  Bank",3));
                objMinhaConta.deposito(valorDep);
                JOptionPane.showMessageDialog(null, "Depósito a ser realizado com sucesso!", "App Bank",1);
            }
            else if (opUsr.equals(operacoes[1]))
            {
                float valor = Float.parseFloat((JOptionPane.showInputDialog(null, "Valor a ser sacado!", "App Bank",3)));
                    if (objMinhaConta.saque(valor))
                {
                    JOptionPane.showMessageDialog(null, "Saque a ser Realizado com sucesso!!","App Bank",1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fundo insuficiente!", "App Bank",1);
                }
            }   
        }  
    }
}

//idade.length =3 => Quantidades de numeros na memoria 
//System.out.println(idade [1])