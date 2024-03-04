package controller;

public class exc03con {
	public exc03con() {
		super();
	}
	public static int invert(String a, int b) {
		if (b>0) {
			System.out.print(a.substring(b-1,b));
			return invert(a, b - 1);
		}else {
		
		 return 1;
        }
	}
	
}
