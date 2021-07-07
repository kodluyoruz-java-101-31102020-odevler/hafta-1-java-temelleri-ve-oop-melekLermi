package com.Hafta1Odevi.Soru3.Ortalama;

import java.util.Random;

public class Ortalama {
	
	/*Soru3: Rastgele sayýlardan oluþmuþ 100 elemanlýk tamsayý dizisindeki tüm elemanlarýn ortalamasýný alacak programý geliþtirin.
	 *Programý yazarken aþaðýdaki özelliklere uygun yazýnýz.
	 *Rastgele oluþan 10 elemanlýk sayý kümesi program yeniden her çalýþtýðýnda deðiþsin. Sabit elemanlý bir dizi vermeyin!
	 *Ortalama almayý saðlayacak kodu bir fonksiyon halinde tasarlayýn. Ýçine diziyi girdi (input) olarak alsýn.
	 *Ortalama alan fonksiyon ortalamayý ondalýklý sayý olarak döndürsün. (return) etsin.
    */
	public static double ortalamaAl(int[] randomDizi) {
		double toplam = 0;
		for(int i=0; i<100; i++) {
			toplam += randomDizi[i];
		}
		double sonuc = toplam / 100;
		return sonuc;
	}
	public static void main(String[] args) {

		Random rand = new Random();
		
		int randomDizi[] = new int[100];
		for(int i=0; i<100; i++) {
			randomDizi[i] = rand.nextInt(100);
			//System.out.print(randomDizi[i] + ",");
		}
		
		System.out.println("Random dizimizin ortalamasý: " + ortalamaAl(randomDizi));	
		
	}

}
