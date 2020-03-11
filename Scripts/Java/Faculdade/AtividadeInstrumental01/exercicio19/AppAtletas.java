
package exercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class AppAtletas
{
    static public void main (String args [])
    {
        //Declarando objeto
        Atletas objAtletas;        
        
        //Entrada de Dados
        String sex [] = {"Masculino", "Feminino"};        
        String nome = JOptionPane.showInputDialog(null, "Insira o nome do(a) atleta:","CBPDS",3);        
        String sexo = (String)JOptionPane.showInputDialog(null,"Escolha o sexo do(a) atleta: ", "CBPDS", 3,null,sex,sex[0]);       
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade do(a) atleta:","CBPDS",3));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira a altura do(a) atleta","CBPDS",3));
        
        //Intanciando um novo Objeto 
        objAtletas = new Atletas (nome,sexo,idade,altura);
        
        //Saída de Dados
        JOptionPane.showMessageDialog(null,"Nome: "+objAtletas.getNome()+"\nSexo: "+objAtletas.getSexo()+"\nIdade: "+objAtletas.getIdade()+
                "\nAltura: "+objAtletas.getAltura()+" m"+objAtletas.status(),"CBPDS",1);    
    }
}
