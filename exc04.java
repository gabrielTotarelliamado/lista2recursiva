package view;

import java.util.Scanner;

import controller.exc04con;

public class exc04 {

	public static void main(String[] args) {
		 exc04con ex4 = new exc04con();
         
			Scanner sc = new Scanner(System.in);
			System.out.println("digite o um numero: ");
	 		int a = sc.nextInt();
	 		String b = "";
	 		int aux=0;
	 		String auxb = "";
	 		int d=0;
	 		String c = exc04con.binario(a,b,aux,auxb,d);
	 		System.out.println(c);
	}

}
