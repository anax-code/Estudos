/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extreamentebasico;
import java.util.*;

/**
 *
 * @author leandro
 */
public class Exercicio1008
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        
       int number = sc.nextInt();
       int qtdHoras = sc.nextInt();
       float salario = sc.nextFloat();
       
       double total = qtdHoras*salario;
       
       System.out.printf("%s%d\n%s%.2f\n","NUMBER = ",number,"SALARY = U$ ",total);
        
    }
    
    
}
