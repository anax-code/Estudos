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
public class Exercicio1007 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int dif = (a*b-c*d);
        
        System.out.println("DIFERENCA = "+dif);
    }
    
}
