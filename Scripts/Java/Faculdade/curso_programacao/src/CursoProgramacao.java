
package secao04;

import java.util.Scanner;

/**
 *
 * @author leandromiguel
 */
public class CursoProgramacao {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        
        int x;
        String s1,s2,s3;
        
        x = sc.nextInt();
        sc.nextLine(); //Importante colocar esse NextLine aqui
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("");
                
        System.out.println("Os dados digitados foram: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
