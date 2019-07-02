package com.ops.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		Scanner scn=null;
		int num[]=null;
		System.out.println("Enter Element");
		//read input from keyboard
		scn=new Scanner(System.in);
		num=new int[5];
		
		for (int i=0;i<num.length;i++) {
			num[i]=scn.nextInt();
		}
		int j;
		int min=0,max=0;
		for(j=0;j<num.length;j++) {
			for(int k=j;k<num.length;k++) {
				if(num[j]>num[k]) {
					int temp=num[k];
					num[k]=num[j];
					num[j]=temp;
				}
			}
				ArrayList<Integer> al=new ArrayList<>(new LinkedList<>());
		}
		
		System.out.println("max"+num[j-1]);
		System.out.println("min"+num[0]);


	}
}
