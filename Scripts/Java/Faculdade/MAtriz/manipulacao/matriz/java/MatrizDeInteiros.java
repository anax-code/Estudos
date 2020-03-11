package manipulacao.matriz.java;

import java.util.Random;
import javax.swing.JOptionPane;

/*
 * @author leandro miguel 
 */
public class MatrizDeInteiros {

    //Atributos 
    private int[][] matriz;

    //Construtor
    public MatrizDeInteiros(int linha, int coluna) {
        this.matriz = new int[linha][coluna];
        geraMatrizZero();
    }

    //Métodos de Acesso
    public int getTotLinha() {
        return matriz.length;
    }

    public int getTotColuna() {
        return matriz[0].length;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    //Métodos Particulares
    private void geraMatrizZero() {
        for (int[] linhas : matriz) {
            for (int coluna = 0; coluna < linhas.length; coluna++) {
                linhas[coluna] = 0;
            }
        }
    }

    public void gerarMatrizAleatorios() {
        Random random = new Random();

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = (1 + random.nextInt(50));
            }
        }
    }

    public String exibirMatriz() {
        StringBuilder dados = new StringBuilder("");
        for (int[] linhas : matriz) {
            for (int valor : linhas) {
                dados.append(valor);
                dados.append("\t    ");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String exibirMatriz2(int[][] valor) {
        StringBuilder dados = new StringBuilder("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                dados.append(valor[i][j]);
                dados.append("\t  ");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String exibirTransposta(int[][] valor) {
        StringBuilder dados = new StringBuilder("");
        for (int i = 0; i < matrizTransposta().length; i++) {
            for (int j = 0; j < matrizTransposta()[i].length; j++) {
                dados.append(valor[i][j]);
                dados.append("\t  ");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public boolean matrizQuadratica() {
        if (matriz.length == matriz[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] procuraValor() {
        int[][] search = new int[matriz.length][matriz[0].length];
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    search[i][j] = valor;
                }
            }
        }
        return search;
    }

    public int[] somaLinhas() {
        int[] linha = new int[matriz.length]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { 
                linha[i] += matriz[i][j];
            }
        }
        return linha;
    }

    public int[] somaColuna() {
        int[] coluna = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            coluna[j] = 0;
            for (int[] matriz1 : matriz) {
                coluna[j] += matriz1[j];
            }
        }
        return coluna;
    }

    public int[][] matrizTransposta() {
        /*instanciei a minha matriz transposta com o número de linhas igual ao número de colunas da matriz 
        gerado e o número de coluna igual ao número de linhas da matriz gerada, por isso coluna vem primeiro e linha depois*/
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[0].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }

//    public int[][] diagonalPrincipal() { //Melhorar o código utilizando uma estrutura de repetição
//        int[][] matrizDiagonalPrincipal = new int[matriz.length][matriz[0].length];
//        for (int i=0,j=0; i<matriz.length && j<matriz[0].length; i++, j++) {
//                if (i == j) {
//                    matrizDiagonalPrincipal[i][j] = matriz[i][j];
//                }
//            }
//        return matrizDiagonalPrincipal;
//    }
    
    public int[][] diagonalPrincipal() { 
        int[][] matrizDiagonalPrincipal = new int[matriz.length][matriz[0].length];
        int k=0;
        for (int i=0;i<matriz.length;i++) {
                if (i == k) {
                    matrizDiagonalPrincipal[i][k]=matriz[i][k];
                    k++;
                }
            }
        return matrizDiagonalPrincipal;
    }

    public int[][] diagonalSecundaria() {
        int col = matriz.length - 1;
        int[][] matrizDiagonalSecundaria = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            matrizDiagonalSecundaria[i][col] = matriz[i][col];
            col--;
        }
        return matrizDiagonalSecundaria;
    }

    public int somaAll() {
        int somaTudo = 0;
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                somaTudo += matriz1[j];
            }
        }
        return somaTudo;
    }

    public int[][] trocaLinhas() {
        int[][] aux = new int[matriz.length][matriz[0].length];
        int linha = matriz.length-1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    aux[linha][j] = matriz[i][j];
                } else if (i == linha) {
                    aux[0][j] = matriz[i][j];
                } 
                else {
                    aux[i][j] = matriz[i][j];
                }
            }
        }
        return aux;
    }

    public int[][] numerosPares() { //Melhorar o código retornando a posição dos pares, Por exemplo posição 0,1
        int[][] aux = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    aux[i][j] = matriz[i][j]; 
                }
            }
        }
        return aux;
    }
//                               |
//                               |
//                               V
    
    public String exibirPares() {
        StringBuilder dados = new StringBuilder("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                dados.append(i);
                dados.append(",");
                dados.append(j);
                dados.append("\t ");
                }else if (matriz[i][j]%2!=0){
                    dados.append("   -   ");
                    dados.append("\t ");
                }
            }
            dados.append("\n");
        }
        return dados.toString();
    }
    
    public int[] maiorValor() {
        int[] aux = {0};
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                if (matriz1[j] > aux[0]) {
                    aux[0] = matriz1[j];
                }
            }
        }
        return aux;
    }

    public int[][] substituirValores() {
        int[][] aux = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    aux[i][j] = 1;
                } else if (matriz[i][j] % 2 != 0) {
                    aux[i][j] = -1;
                }
            }
        }
        return aux;
    }

    public boolean matrizSimetrica() { //Melhorar o código, retornando boolean.  
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

//    public int[] somaDiagonalPrincipal() { //Melhorar esse código com uma estrutura de repetição só
//        int[] soma = {0};
//        for (int i = 0, j=0 ; i < matriz.length && j<matriz[0].length; i++,j++) {
//                if (i == j) {
//                    soma[0] += matriz[i][j];
//                }
//            }
//        return soma;
//    }
    
    public int[] somaDiagonalPrincipal() { //Melhorar esse código com uma estrutura de repetição só
        int[] soma = {0};
        int k=0;
        for (int i = 0;i<matriz.length;i++) {
                if (i == k) {
                    soma[0] += matriz[i][k];
                    k++;
                }
            }
        return soma;
    }
    
    public double[] mediaMatriz() {
        double[] media = {0};
        double[] soma = {0};
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                soma[0] += matriz1[j];
            }
            media[0] = soma[0] / (matriz.length*matriz[0].length);
        }
        return media;
    }
    
//    public int[][] multiplicaMatriz(){
//        int [][]matrizResultado=new int[matriz.length][matriz[0].length];
//        matrizResultado = matriz.length*2;
//    }

//    public int [][] trocaDiagonais(){
//        int col = matriz.length-1;
//        int[][] aux = new int [matriz.length][matriz[0].length];
//        for (int i=0;i<matriz.length;i++){
//            for(int j=0;j<matriz[i].length;j++){
//                if(i+j==col){
//                    aux[i][j]= matriz[i][i];
//                }
//            }
//        }
//        return aux;
//    }
}
