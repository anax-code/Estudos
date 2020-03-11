
package secao04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leandromiguel
 */
public class Curso_programacao {

    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        
        System.out.println("----------------------------------------------");

        double x = 10.356745;
        System.out.printf("%.2f%n", x);
        
        System.out.println("----------------------------------------------");
     
        //Adicionar o separator "."
        double y = 10.334342;
        System.out.printf("%.3f%n",y);
        
        System.out.println("----------------------------------------------");
        
        System.out.printf("Resultado = %.2f metros\n", y);
        
        System.out.println("----------------------------------------------");
        
        String nome = "Maria";
        int idade = 20;
        double  renda = 456.32;
        
        System.out.printf("%s tem %d anos e ganha R$%.2f reais %n", nome, idade, renda);
           
        System.out.println("----------------------------------------------");
        
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code =5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
       
        System.out.printf("Products: %n %s, which price is $ %.2f %n Office desk, which price is "
                + "$ %.2f %n%n Record: %d years old, code %d and gender: %c %n%n Measure with eight decimal places:"
                + "%.8f %n Rouded (three decimal places): %.3f %n"
                , product1, price1,price2, age, code,gender, measure, measure,measure);
        Locale.setDefault(Locale.US);
        System.out.printf(" US decimal point: %.3f %n",measure);      
        
        System.out.println("----------------------------------------------");
        
        int a,b;
        a=5;
        b=2*a;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------------");
        
        int c;
        double d;
        c=5;
        d=2*c;
        System.out.println(c);
        System.out.println(d);
        
        System.out.println("----------------------------------------------");
        
        System.out.println("Cálculo da área do trapézio");
        int altura;
        int baseTrapezio;
        int area;
        altura  = 5;
        baseTrapezio=(6+8)/2;
        
        area=baseTrapezio*altura;
        
        System.out.println(area);
        
        System.out.println("----------------------------------------------");
        System.out.println("Casting. Conversão explícita dos valores");
        int e,f;
        double resultado;
        e=5;
        f=2;
        resultado = (double) e/f;
        System.out.println(resultado);
        System.out.println("");
        double g;
        int h;
        g=5.0;
        h=(int)g;
        
        System.out.println(h);
        System.out.println("----------------------------------------------");
        
        System.out.println("Entrada de Dados");
        Scanner sc = new Scanner(System.in);
        System.out.println("String");
        System.out.println("Digite algum nome:");
        String name;
        name = sc.nextLine();
        System.out.println("Você digitou: "+ name);
        
        System.out.println("");
        System.out.println("Inteiros");
        System.out.println("Digite um número:");
        int number01;
        number01=sc.nextInt();
        System.out.println("Você digitou o número: "+ number01);
        
        System.out.println("");
        System.out.println("Ponto flutuante");
        System.out.println("Digite um número com ponto flutuante: ");
        double number02;
        number02 = sc.nextDouble();
        System.out.println("Você digitou o número com ponto fluante: "+ number02);
        
        System.out.println("");
        System.out.println("Character");
        System.out.println("Digite um character ");
        char letters01;
        letters01 = sc.next().charAt(0);
        System.out.println("Você digitou a letra: "+ letters01);
        
        
        
         
                
    }
}
