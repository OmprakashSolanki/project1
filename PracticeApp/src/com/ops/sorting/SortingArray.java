package com.ops.sorting;
public class SortingArray {

	public static void main(String[] args) {

			int arr[]= {0,1,0,1,1,0};
			
			int j=0;
			while(j<arr.length) {
				
				for (int k = j+1; k < arr.length; k++) {
					
					if(arr[j]>=arr[k]) {
						int temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
				}
				System.out.println(arr[j]);

				j++;
			}
			/*for (int i = 0; i < arr.length; i++) {
				int l = arr[i];
				System.out.println(l);

			}*/
	}

}
