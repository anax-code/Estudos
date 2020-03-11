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
public class Exercicio1002
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
    
        double raio = input.nextDouble();
    
        double area = Math.pow(raio, 2)*3.14159;
    
        System.out.printf("%s%.4f\n","A=",area); 
    }  
}
