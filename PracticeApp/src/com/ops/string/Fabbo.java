package com.ops.string;

public class Fabbo {
	int fabsum;
	
	public Fabbo() {

	}
	public void    fabsum(int n) {
		 
		if(fabsum==0) {
			fabsum=1;
			n=n-1;
			fabsum(n);
	
		}else {
			int oldSum=fabsum-1;
			fabsum=fabsum+oldSum;
			System.out.println("jdbsb"+fabsum);
			if(n==0) {
				return;
			}
			n=n-1;
			fabsum(n);
		}
	}
public static void main(String[] args) {
	
	
	Fabbo f=new Fabbo();
	System.out.println("lnaldh");
	f.fabsum(10);
}


}
