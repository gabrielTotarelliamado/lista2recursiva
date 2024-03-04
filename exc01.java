package view;

import controller.exc01con;
import java.util.*;
public class exc01 {

	public static void main(String[] args) {
		exc01con ex1 = new exc01con();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o um numero: ");
 		int a = sc.nextInt();
 		
 		int soma = 1;
 		int c = exc01con.cont(a,soma );
 		
 		System.out.println(" a quantidade de numeros  são: "+ c);
		
	}

}
