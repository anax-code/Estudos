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
public class Exercicio1005 
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        
        double media = ((A*3.5)+(B*7.5))/11;
        
        System.out.printf("%s%.5f\n","MEDIA = ",media);
        
    }
}
