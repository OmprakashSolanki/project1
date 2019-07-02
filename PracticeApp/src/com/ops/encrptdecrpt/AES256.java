package com.ops.encrptdecrpt;

public class AES256 {

	
	
	//Decryption using AES-256 with base64 encoding having UTF-8 charset o
	
	
	public static void main(String[] args)
	{
	    String originalString = "omprakashSolanki";
	     
	    String encryptedString = Encryption.encrypt(originalString,"boooooooooom!!!!") ;
	   String decryptedString = Decyption.decrypt(encryptedString, "boooooooooom!!!!") ;
	      
	    System.out.println(originalString);
	   
	    System.out.println(encryptedString);
	    
	    System.out.println(decryptedString);
	}
	
	
	
}
