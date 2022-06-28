/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter the number " + "="+ " " );
        int n = sc.nextInt();
        int tables = 0;
        for(int i=1;i<=10;i++){
            tables = n * i;
            System.out.println(n + " * " + i +  " = " + tables);
  
        }
         
        
            
	}
}
