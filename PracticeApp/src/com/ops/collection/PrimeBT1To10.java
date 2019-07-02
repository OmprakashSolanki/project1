package com.ops.collection;

public class PrimeBT1To10 {
public static void main(String[] args) {
	
	for (int i = 20; i <= 80; i++) {
		int flag=0;
		for(int j=1;j<=i;j++) {
			
			if(i%j==0) {
				flag++;
				
			}
		}
		if(flag==2) {
			System.out.println(i);
		}
	}
}

}
