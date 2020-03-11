package exercicio05;

import javax.swing.JOptionPane;

public class AppNumerosAleatorios
{
    private static final String titulo = "Número da Sorte";
    
    public static void main(String[] args) 
    {
        //Declarando e Instanciando objeto
        SorteioDosNumeros objSorteioDosNumeros = new SorteioDosNumeros();
        
        //Estrutura de Repetição
        while(true) 
        {
            //Entrada de Dados e Saída de Dados
            String numero = JOptionPane.showInputDialog(null,"Qual o seu chute?\nTentativa: " + objSorteioDosNumeros.getTentativas(), AppNumerosAleatorios.titulo, JOptionPane.QUESTION_MESSAGE);
            
            if (numero == null) 
            {
                JOptionPane.showMessageDialog(null, "Você Cancelou!",AppNumerosAleatorios.titulo, JOptionPane.INFORMATION_MESSAGE, null);
                break;
            }
            else
            {
                int numeroEscolhido = Integer.parseInt(numero);
            
                if (objSorteioDosNumeros.acertou(numeroEscolhido))
                {
                    int resposta = JOptionPane.showConfirmDialog(null,"Você acertou! Numero: " + numeroEscolhido + " Tentativas: " + objSorteioDosNumeros.getTentativas()+ 
                        "\nQuer jogar outra vez?",AppNumerosAleatorios.titulo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                    if (resposta == 1)
                    {
                        break;
                    }
                    else
                    {
                        objSorteioDosNumeros = new SorteioDosNumeros();  
                    }
                }                
            }                      
        }
    }
}
