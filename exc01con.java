package controller;

public class exc01con {
	public exc01con() {
		super();
	}
	
	public static int cont(double a,  int soma){
		
		if(a>=10) {
			soma=soma+1;
			a=a/10;
			return cont(a  ,soma);
		}else {
			return soma;
		}


	}
}
