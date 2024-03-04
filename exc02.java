package view;


import controller.exc02con;
import java.util.*;
public class exc02 {

	public static void main(String[] args) {
		exc02con ex2 = new exc02con();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("digite o um numero: ");
 		int a = sc.nextInt();
 		System.out.println("digite o um numero a ser verificado: ");
 		int b = sc.nextInt();
 		int soma = 0;
 		int c = exc02con.conta(a,b,soma );
 		
 		System.out.println(" a quantidade de numeros  são: "+ c);
		
	}

}
