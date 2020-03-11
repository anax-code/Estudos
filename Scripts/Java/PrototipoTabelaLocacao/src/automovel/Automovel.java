
package automovel;

/**
 *
 * @author leandromiguel
 */
public class Automovel {
    //Atributos
    private float precoDiaria;
    private float precoPorKm;
    private int diasUtilizados;
    private float kmPercorridos;

    public Automovel(float diaria, float porKm, int diasUtilizados, float kmPercorridos) {
        this.precoDiaria = diaria;
        this.precoPorKm = porKm;
        this.diasUtilizados = diasUtilizados;
        this.kmPercorridos = kmPercorridos;
    }

    public Automovel() {
    }

    public float getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public float getPrecoPorKm() {
        return precoPorKm;
    }

    public void setPrecoPorKm(float precoPorKm) {
        this.precoPorKm = precoPorKm;
    }

    public int getDiasUtilizados() {
        return diasUtilizados;
    }

    public void setDiasUtilizados(int diasUtilizados) {
        this.diasUtilizados = diasUtilizados;
    }

    public float getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(float kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    //Métodos Particulares
    
    public float valorPacoteFechado()
    {
        return precoDiaria*diasUtilizados;
    }
    
    public String resultadoDoPacoteFechado()
    {
        return "\n\nTotal a pagar por " + diasUtilizados + " dia(s)" + " é de R$ "+ valorPacoteFechado()+ " reais.";
    }
    
    public float valorPrecoKm(){
        return precoPorKm*kmPercorridos;
    }
    
    public String resultadoDoKmPercorrido()
    {
        return "\n\nTotal a pagar por " + kmPercorridos + " Km" + " é de R$ "+ valorPrecoKm()+ " reais.";
    }
}
