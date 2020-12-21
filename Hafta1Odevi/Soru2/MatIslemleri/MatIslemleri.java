package com.Hafta1Odevi.Soru2.MatIslemleri;

import java.util.Scanner;

public class MatIslemleri {

	public static void main(String[] args) {
		
		/*Soru2: Kullan�c�n�n konsol ekrandan 4 temel matematiksel i�lemi yapabildi�i bir program yazman�z bekleniyor.
		 *  Program a�a��daki �zellikleri sa�lamal�d�r.
		 *Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme
	     *Kullan�c�ya 4 i�lemden birini se�ece�i men�y� konsol ekrana yazd�r�n. �rne�in: 1-Toplama, 2-��karma vb...
		 *Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say� girmesini isteyin. Bu girilen iki say�y� de�i�kenlerde saklay�n.
		 *Se�ilen i�lem tipine g�re matematiksel i�lemi yap�n ve konsol ekran�na yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yapmak istediginiz islem icin bas�ndaki rakam� giriniz: ");
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-B�lme");
		short secim = scan.nextShort();
		
		System.out.println("�slem i�in ilk tam sayiyi giriniz.");
		short ilkSayi = scan.nextShort();
		
		System.out.println("�slem i�in ikinci tam sayiyi giriniz.");
		short ikinciSayi = scan.nextShort();
		
		short sonuc = 0;
		
		if ( secim == 1) {
			sonuc = (short) (ilkSayi + ikinciSayi);
			System.out.println("�slem sonucu: " + sonuc);
		}
		else if( secim == 2) {
			sonuc = (short) (ilkSayi - ikinciSayi);
			System.out.println("�slem sonucu: " + sonuc);
		}
		else if( secim == 3 ) {
			sonuc = (short) (ilkSayi * ikinciSayi);
			System.out.println("�slem sonucu: " + sonuc);
		}
		else if( secim == 4){
			try {
			sonuc = (short) (ilkSayi / ikinciSayi);
			System.out.println("�slem sonucun: " + sonuc);
			}catch(ArithmeticException e) {
				System.out.println("0'a b�l�nemez!");
				System.out.println("�slemin hatal�!");
			}
		}
		else
			System.out.println("Hatal� secim! 1,2,3 ya da 4'e bas�n�z!");
	}

}
