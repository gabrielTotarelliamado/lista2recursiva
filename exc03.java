package view;
import java.util.*;
import controller.exc03con;
public class exc03 {

	public static void main(String[] args) {
       exc03con ex3 = new exc03con();
           
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o um texto: ");
 		String a = sc.next();
 		int b = a.length();
 		
 		
 		exc03con.invert(a,b);
 		
	}

}
