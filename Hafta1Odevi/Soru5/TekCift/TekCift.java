package com.Hafta1Odevi.Soru5.TekCift;

import java.util.Random;

public class TekCift {

	public static void main(String[] args) {

		/*Soru5: Rastgele say�lardan olu�an 100 elemanl�k tamsay� dizisi olu�turun.
		 *Ard�ndan tek ve �ift say�lar� bulan bir program yaz�n.
		 */
		 
		Random rand = new Random();
		
		int randomDizi[] = new int[100];
		for(int i=0; i<100; i++) {
			randomDizi[i] = rand.nextInt(100);
			
			if( randomDizi[i] %2 == 0) {
				System.out.println("Dizinin " + (i+1) + ". eleman� cift sayi");
			}
			else {
				System.out.println("Dizinin " + (i+1) + ". eleman� tek sayi");
			}
		}
		   
	}

}
