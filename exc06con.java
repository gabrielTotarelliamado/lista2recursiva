package controller;

public class exc06con {
	public exc06con() {
		super();
	}
	
	public static double seri(int n,double x,int z,int m) {
		
		if (n >= 1) {
        	
        	z=z*n;
        	return seri(n-1,x,z,m);
    
        
        } else {
        	
        	if(m>1){
             x = (1/z);
             n=m-1;
        	return seri(n,x,z=1,m-1);
        	}else {
        		return x;
        	}
        }
        
	}
}

