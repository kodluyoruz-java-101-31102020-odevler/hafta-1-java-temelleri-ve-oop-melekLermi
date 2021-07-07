package com.Hafta1Odevi.Soru7.Kalitim;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PersonelReport extends Report {

	public static String hashMD5Result(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5"); 
        byte[] messageDigest = md.digest(input.getBytes()); 
        BigInteger no = new BigInteger(1, messageDigest); 
        String hashtext = no.toString(16); 
        while (hashtext.length() < 32) { 
            hashtext = "0" + hashtext; 
        } 
        
		return hashtext;
	} 
	
	public static void main(String args[]) throws NoSuchAlgorithmException 
    { 
        String s = "MelekLermi"; 
        System.out.println("Your HashCode Generated by MD5 is: " + hashMD5Result(s)); 
    } 
}


