package cap05;
import java.text.DecimalFormat; 
public class arrayNumeros {
    public static void main(String[] args) {
        int[]inteiro = new int [10];
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("000");
        for (int i =0; i<inteiro.length;i++){
            inteiro[i]= (int)(Math.random()*1000);
            System.out.println(df.format(inteiro[i]));
        }
    }  
}


/*
Linha 5: declara um array unidimensional chamado inteiro contendo dez elementos (índices de 0 a 9). Caso seja necessário gerar uma 
quantidade maior, basta trocar o valor 10 pela quantidade necessária.
Linha 6: declara um objeto chamado df a partir da classe DecimalFormat que será usado para formatar o valor numérico que será apresentado
em tela.
Linha 7: aplica a formatação padrão que será usada pelo objeto df, ou seja, a formatação que será aplicada ao valor numérico gerado.
Linha 8: contém um laço de repetição com a instrução for que faz com que as linhas 9 e 10 sejam executadas várias vezes, dependendo da 
quantidade de elementos do array inteiro, declarado na linha 5. O método retorna a quantidade de elementos do array, no caso 10, mas 
poderia ser outro valor. em nosso caso, a repetição ocorrerá dez vezes. O valor da variável "i" inicia em zero e é incrementado em 1 até
o limite estabelecido pelo laço.
Linha 9: armazena no array inteiro um valor gerado aleatoriamente por meio do random. A cada ciclo de execução do laço o número gerado 
é armazenado num elemento diferente do array. Na primeira vez o número é armazenado em inteiro [0], na segunda em inteiro[1] e assim 
sucessivamente.
Linha 10: imprime em tela o número gerado que foi armazenado ne elemento array.
*/