package com.Hafta1Odevi.Soru2.MatIslemleri;

import java.util.Scanner;

public class MatIslemleri {

	public static void main(String[] args) {
		
		/*Soru2: Kullanýcýnýn konsol ekrandan 4 temel matematiksel iþlemi yapabildiði bir program yazmanýz bekleniyor.
		 *  Program aþaðýdaki özellikleri saðlamalýdýr.
		 *Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme
	     *Kullanýcýya 4 iþlemden birini seçeceði menüyü konsol ekrana yazdýrýn. Örneðin: 1-Toplama, 2-Çýkarma vb...
		 *Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý girmesini isteyin. Bu girilen iki sayýyý deðiþkenlerde saklayýn.
		 *Seçilen iþlem tipine göre matematiksel iþlemi yapýn ve konsol ekranýna yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yapmak istediginiz islem icin basýndaki rakamý giriniz: ");
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bölme");
		short secim = scan.nextShort();
		
		System.out.println("Ýslem için ilk tam sayiyi giriniz.");
		short ilkSayi = scan.nextShort();
		
		System.out.println("Ýslem için ikinci tam sayiyi giriniz.");
		short ikinciSayi = scan.nextShort();
		
		short sonuc = 0;
		
		if ( secim == 1) {
			sonuc = (short) (ilkSayi + ikinciSayi);
			System.out.println("Ýslem sonucu: " + sonuc);
		}
		else if( secim == 2) {
			sonuc = (short) (ilkSayi - ikinciSayi);
			System.out.println("Ýslem sonucu: " + sonuc);
		}
		else if( secim == 3 ) {
			sonuc = (short) (ilkSayi * ikinciSayi);
			System.out.println("Ýslem sonucu: " + sonuc);
		}
		else if( secim == 4){
			try {
			sonuc = (short) (ilkSayi / ikinciSayi);
			System.out.println("Ýslem sonucun: " + sonuc);
			}catch(ArithmeticException e) {
				System.out.println("0'a bölünemez!");
				System.out.println("Ýslemin hatalý!");
			}
		}
		else
			System.out.println("Hatalý secim! 1,2,3 ya da 4'e basýnýz!");
	}

}
