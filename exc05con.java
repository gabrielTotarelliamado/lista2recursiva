package controller;

public class exc05con {
	
	public exc05con() {
		super();
	}
	
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        
	}
	
	
}
