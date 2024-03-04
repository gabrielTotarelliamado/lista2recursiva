package view;
import controller.exc06con;
import java.util.Scanner;

public class exc06 {
	public static void main(String[] args) {
		 exc06con ex6 = new exc06con();
        	int n = 100;
			Scanner sc = new Scanner(System.in);
			while(n>20) {
			System.out.println("digite o um numero da serie: ");
	 		 n = sc.nextInt();
	 		 
			}
			double x =1;
			int z = 1;
			int m = n;
	 		double c = exc06con.seri(n,x, z,m);
	 		System.out.println(c);
}
}
