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
public class Exercicio1006 
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        double media  = ((a*2)+(b*3)+(c*5))/10;
        
        System.out.printf("%s%.1f\n","MEDIA = ",media);
    }
    
}
