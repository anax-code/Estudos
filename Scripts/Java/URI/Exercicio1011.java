/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extreamentebasico;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author anaxiel
 */
public class Exercicio1011 
{
    public static void main (String args [])
    {
        Scanner input = new Scanner (System.in);
        
        double raio = input.nextDouble();
        
        double volume = (4.0/3)*PI*Math.pow(raio, 3);
        
        System.out.printf("%s%.3f","VOLUME = ", volume);
    }
}
