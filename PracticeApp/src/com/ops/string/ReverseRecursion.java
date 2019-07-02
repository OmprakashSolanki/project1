package com.ops.string;

public class ReverseRecursion {
	public String reverse(String str) {
		//System.out.println(str.substring(1));
		 if(!(str.length()==0)) {
			 
		 reverse(str.substring(1));
		 System.out.print(str.charAt(0));
		 }
		 return str;
	}

	public static void main(String[] args) {

		ReverseRecursion rev = new ReverseRecursion();
		rev.reverse("omprakash");
	}
}
