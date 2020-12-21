package com.Hafta1Odevi.Soru3.Ortalama;

import java.util.Random;

public class Ortalama {
	
	/*Soru3: Rastgele say�lardan olu�mu� 100 elemanl�k tamsay� dizisindeki t�m elemanlar�n ortalamas�n� alacak program� geli�tirin.
	 *Program� yazarken a�a��daki �zelliklere uygun yaz�n�z.
	 *Rastgele olu�an 10 elemanl�k say� k�mesi program yeniden her �al��t���nda de�i�sin. Sabit elemanl� bir dizi vermeyin!
	 *Ortalama almay� sa�layacak kodu bir fonksiyon halinde tasarlay�n. ��ine diziyi girdi (input) olarak als�n.
	 *Ortalama alan fonksiyon ortalamay� ondal�kl� say� olarak d�nd�rs�n. (return) etsin.
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
		
		System.out.println("Random dizimizin ortalamas�: " + ortalamaAl(randomDizi));	
		
	}

}
