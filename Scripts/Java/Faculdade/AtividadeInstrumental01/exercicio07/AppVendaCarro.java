
package exercicio07;

import javax.swing.JOptionPane;

public class AppVendaCarro
{
    public static void main(String args [])
    {
        try
        {
        //Entrada de Dados
        Object [] ma = {"Fiat", "Ford", "Chevrolet"};
        Object [] mo = {"Hatch", "Sport", "Sedan", "SUV"};
        Object [] co = {"Preto", "Branco", "Prata"};
        Object [] com = {"GASOLINA", "ALCOOL", "DIESEL", "GNV", "FLEX"};
        
        String marca = (String) JOptionPane.showInputDialog(null, "Selecione a marca do Carro!\n", "Venda do Carro",JOptionPane.PLAIN_MESSAGE,null, ma, "Fiat");
        String modelo = (String) JOptionPane.showInputDialog(null, "Selecione o modelo do Carro!\n", "Venda do Carro",JOptionPane.PLAIN_MESSAGE,null, mo, "Hatch");
        String cor = (String) JOptionPane.showInputDialog(null, "Selecione a cor do Carro!\n", "Venda do Carro",JOptionPane.PLAIN_MESSAGE,null, co, "Preto");
        String combustivel = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de combustível!\n", "Venda do Carro",JOptionPane.PLAIN_MESSAGE,null, com, "GASOLINA");
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano do Carro!\n", "Venda do Carro",3));
        double precoDeCusto = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o Preço do Veículo!", "Venda do Carro", 3));
        
        CaracteristicasCarro objCaracteristicasCarro = new CaracteristicasCarro(marca,modelo,cor,combustivel,ano,precoDeCusto);
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null, "Marca: "+objCaracteristicasCarro.getMarca()+"\nModelo: "
                +objCaracteristicasCarro.getModelo()+"\nCor: "+objCaracteristicasCarro.getCor()+"\nCombustivel: "
                +objCaracteristicasCarro.getCombustivel()+"\nAno: "+objCaracteristicasCarro.getAno()
                +"\nPreço de Venda: R$"+objCaracteristicasCarro.quantoCusta(), "Informações Gerais",1);
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Encerrando a Execução!");
        }
    }
}
