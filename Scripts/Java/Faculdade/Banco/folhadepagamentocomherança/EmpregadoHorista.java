
package folhadepagamentocomherança;


public class EmpregadoHorista extends Empregado
{
    //Atributos = Estrutura
    private float valorHora;
    private int horasTrab;
    
    //Construtor
    public EmpregadoHorista(String matricula, String nome, float valorHora, int horasTrab)
    {
        super(matricula, nome);
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
        
    }
    
    
    
}
