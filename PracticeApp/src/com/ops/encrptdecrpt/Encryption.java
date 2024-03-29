package com.ops.encrptdecrpt;

import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {

		private static String secretKey = "boooooooooom!!!!";
		private static String salt = "ssshhhhhhhhhhh!!!!";
		
		//Encryption using AES 256, base64 encoding in UTF-8 charset.
		
		public static String encrypt(String strToEncrypt, String secret)
		{
		    try
		    {
		        byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		        IvParameterSpec ivspec = new IvParameterSpec(iv);
		         
		        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		        KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), 65536, 128);
		        SecretKey tmp = factory.generateSecret(spec);
		        SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
		         
		        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
		        return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		    }
		    catch (Exception e)
		    {
		        System.out.println("Error while encrypting: " + e.toString());
		    }
		    return null;
		}
}
