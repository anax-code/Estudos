package cap05;
import java.util.*;
public class ArrayOrdena {
    public static void main (String []args){
        String []nomes = {"Lucas","Mateus", "Daniel", "Júlia", "Tatiana", "Amanda", "Rebeca"};
        char [] vogais  = {'i', 'u', 'e', 'a', 'o'};
        int [] numeros  = {9,2,7,5,1,3,0,4,6,8};
        float []notas = {7.6f, 8.5f, 9.7f, 5.4f, 7.4f};
        Arrays.sort(nomes);
        System.out.print("\nNomes: ");
        for(String name: nomes){
            System.out.print(name+", ");
        }
        Arrays.sort(vogais);
        System.out.print("\nVogais: ");
        for (char vogal:vogais){
            System.out.print(vogal+", ");
        }
        Arrays.sort(numeros);
        System.out.print("\nNumeros: ");
        for (int numbers: numeros){
            System.out.print(numbers+", ");
        }
        Arrays.sort(notas);
        System.out.print("\nNotas: ");
        for (float notes:notas){
            System.out.print(notes+", ");
        }
        System.exit(0);
    }
}

/*
Linhas 5 a 8: declaram e inicializam quatro arrays unidimensionais, cada um de um tipo diferente de dado;
Linhas 9, 14, 19 e 24: classificam os elementos do array em ordem alfabética (ou numérica) por meio da classe "Arrays". A classe Arrays 
permite manipular os elementos de um array (ordená-los ou realizar uma pesquisa com eles). Para ordenar os elementos foi usado o método
"sort".
Linha 11: Contém um laço de repetição com a instrução "for" que faz com que cada elemento do array nomes seja atribuído à variável nome, 
um de cada vez para cada execução do laço. Como array possui 6 elementos, o laço será executado 6 vezes, imprimindo o conteúdo de todos 
os elementos do array. O mesmo ocorre com os laços das linhas 16, 21 e 26.
*/
