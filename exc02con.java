package controller;

public class exc02con {
	public exc02con() {
		super();
	}
	
	public static int conta(int a,int b,  int soma){
		
		if(a>=1) {
			if((a%10) == b) {
				soma=soma+1;
			}
			
			
			a=a/10;
			return conta(a ,b ,soma);
		}else {
			return soma;
		}
    }
}
