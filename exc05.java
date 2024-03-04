package view;

import java.util.Scanner;

import controller.exc05con;

public class exc05 {

	
		public static void main(String[] args) {
			 exc05con ex5 = new exc05con();
	         	int n = 100;
				Scanner sc = new Scanner(System.in);
				while(n>20) {
				System.out.println("digite o um numero: ");
		 		 n = sc.nextInt();
				}
				
		 		int c = exc05con.fibonacci(n);
		 		System.out.println(c);
	}

}
