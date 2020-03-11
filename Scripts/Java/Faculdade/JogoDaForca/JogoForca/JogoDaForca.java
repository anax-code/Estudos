package JogoForca;

import java.util.Random;

public class JogoDaForca {

    private Palavra listaDePalavras[] = new Palavra[10];

    private String[] palavras = {"abelha", "baleia", "borboleta", "burro", "cabra", "cachorro", "cavalo", "elefante", "esquilo", "gato"};
    private String[] dicas = {" Inseto no qual vive na Monarquia", " Mamífero aquático", "Inseto que voa", " Marido da mula", "Produz leite", " Melhor amigo do homem", " Mamífero para cavalgar ", " Animal de circo", " Espécie de 3 irmãos animais de um filme", "Dorme o dia inteiro!"};

    private String palavraSorteada;
    private int nAleatorioDoRandom = 0;
    private char letra;
    private byte qtde;
    private char letrausd[];

    private int vidas = 7;
    private char[] novo;

    public JogoDaForca() {

        int i = 0;
        for (i = 0; i < palavras.length; i++) {
            listaDePalavras[i] = new Palavra();
            listaDePalavras[i].setTexto(palavras[i]);
            listaDePalavras[i].setDica(dicas[i]);

        }

        novo = new char[aleatorio().length()];

    }

    public void colocavida(int vid) {
        this.vidas = vid;

    }

    public Palavra getListaDePalavras() {
        return listaDePalavras[nAleatorioDoRandom];
    }

    public int getVidas() {

        return vidas;
    }

    public void setListaDePalavras(Palavra[] listaDePalavras) {
        this.listaDePalavras = listaDePalavras;
    }

    public String getPalavraSorteada() {

        return palavraSorteada;
    }

    public char[] getNovo() {
        
        return novo;
    }

    public void setLetra(char letra) {
        this.letra = letra;

    }

    public int getnAleatorioDoRandom() {
        return nAleatorioDoRandom;
    }

    public String aleatorio() {

        Random palavrasleatorio = new Random();
        nAleatorioDoRandom = palavrasleatorio.nextInt(listaDePalavras.length);
        palavraSorteada = listaDePalavras[nAleatorioDoRandom].getTexto();
        return palavraSorteada;
    }

    public void criando() {

        int i = 0;
        for (i = 0; i < palavraSorteada.length(); i++) {
            novo[i] = '_';
        }
    }

    public String imprimirPalavra() {

        StringBuilder dados = new StringBuilder("");
        for (int i = 0; i < palavraSorteada.length(); i++) {
            novo[i] = '_';
            dados.append(" _ ");
            dados.append("\t");
        }
        return dados.toString();
    }

    public char[] acertos(char[] v) {

        int i = 0;

        for (i = 0; i < palavraSorteada.length(); i++) {

            if (palavraSorteada.charAt(i) == letra) {
                novo[i] = letra;
                qtde++;
                if (palavraSorteada.charAt(i) != letra) {
                    qtde++;

                }

            }

        }
        return novo;
    }

    public Boolean compara() {

        Boolean acertou = false;

        if (getListaDePalavras().getTexto().equalsIgnoreCase(String.valueOf(novo))) {
            return acertou = true;

        }

        return acertou;
    }

    public void perdendo() {
        int i = 0;
    
   
            
        if (!palavraSorteada.contains(String.valueOf(letra))) {
            vidas--;

       
        }

    }

    public char[] usadas(char lletra) {
        int i = 0;
        letrausd = new char[qtde];

        letrausd[i] = lletra;
        i++;
        return letrausd;
    }

}
