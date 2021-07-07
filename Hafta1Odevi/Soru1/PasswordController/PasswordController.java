package com.Hafta1Odevi.Soru1.PasswordController;

import java.util.Scanner;

public class PasswordController {
	
	/* Soru1: String tipinde sabit bir þifre deðiþkeni oluþturun.
	 *  Örneðin: String password = "12345"; gibi.
	 *   Ardýndan, kullanýcýdan klavyeden bir þifre girmesini isteyin.
	 *    Girilen þifre ile deðiþkende tuttuðunuz deðeri kýyaslayýn.
	 *     Eðer, iki deðer birbirine eþitse ekrana "Giriþ Baþarýlý!",
	 *      deðilse "Giriþ Baþarýsýz" yazdýrýn.
	 */
		
	public static void main(String[] args) {
		
		String password = "12345";

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Lütfen sifrenizi giriniz.");
		String userInputPassword = userInput.next();
		
		if( password.equals(userInputPassword) ) {
			System.out.println("Giriþ Baþarýlý!");
		}
		else
			System.out.println("Giriþ Baþarýsýz!");
		
		userInput.close();		

	}

}
