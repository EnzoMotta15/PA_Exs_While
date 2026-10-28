/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int numero = entrada.nextInt();
	int x = 1;
	
	while (x <=10){
	    System.out.println(numero + "x" + x + "=" + (numero*x));
	    x = x + 1;
	}
	entrada.close();
	}
	 
	}
    
		
		
		
