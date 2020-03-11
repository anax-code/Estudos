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
public class Exercicio1009 
{
    static public void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.nextLine();
        double sal = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double comi = 0.15*vendas;
        
        double total = comi+sal;
        
        System.out.printf("%s%.2f\n","TOTAL = R$ ",total);
        
    }
    
    
}
