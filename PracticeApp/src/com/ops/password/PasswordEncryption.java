package com.ops.password;

import java.security.MessageDigest;
import java.util.Base64;

public class PasswordEncryption {

	public static byte[] calculateHash(String pwd) throws Exception {

		MessageDigest md = null;
		byte[] encrypPwd = null;
		// get mmd
		md = MessageDigest.getInstance("SHA-1");
		//reset the md
		md.reset();
		md.update(pwd.getBytes());

		encrypPwd = md.digest();
		return encrypPwd;
	}

	public static void main(String[] args) throws Exception {

		String  encrypPwd = Base64.getEncoder().encodeToString(PasswordEncryption.calculateHash("OmprakahSolanki"));
		
		System.out.println(encrypPwd.toString());
	}
}
