package com.ops.strtoken;

import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Java Prog Language");
		
		System.out.println(st);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
		
		StringTokenizer st1=new StringTokenizer("Javaprograming language", "a",true);
		
		System.out.println(st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}
}
