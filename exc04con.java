package controller;

public class exc04con {
	public exc04con() {
		super();
	}
	public static String binario(int a, String b,int aux,String auxb,int d ) {
		
		if (a>0) {
			 aux = a%2;
			 b = b + String.valueOf(aux);
			 a = a/2;
			
			return binario(a, b, aux, auxb,d);
			
		}else {
			if(d==0) {
				aux=b.length();
				d = 1;
			}
			
			if(aux>0) {
				auxb = auxb + b.substring(aux-1,aux);
				return binario(a, b, aux-1, auxb,d);
				
			}else {
		
		 return auxb;
			}
        }
	}
}
