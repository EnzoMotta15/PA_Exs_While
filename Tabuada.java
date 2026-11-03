/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args){
	    Scanner entrada = new Scanner (System.in);
	    int conta = 0;
	    System.out.println("Insira o número da tabuada desejada:");
	    
	    int numero = entrada.nextInt();
	    
	    System.out.println("Tabuada do:"+numero);
	    //aqui inserimos a estrutura de repetição, quantas vezes o codigo será executado. No exemplo a estrutura tem que rodar 10 vezes */
	    
	    for (int i = 0; i<=10; i++)
	    {
	    conta = numero * i;
	    System.out.println(numero+ "x"+ i +"=" +conta);
	    }
	}
}

