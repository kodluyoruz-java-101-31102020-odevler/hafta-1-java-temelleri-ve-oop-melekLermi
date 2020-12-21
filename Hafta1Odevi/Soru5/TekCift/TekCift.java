package com.Hafta1Odevi.Soru5.TekCift;

import java.util.Random;

public class TekCift {

	public static void main(String[] args) {

		/*Soru5: Rastgele sayýlardan oluþan 100 elemanlýk tamsayý dizisi oluþturun.
		 *Ardýndan tek ve çift sayýlarý bulan bir program yazýn.
		 */
		 
		Random rand = new Random();
		
		int randomDizi[] = new int[100];
		for(int i=0; i<100; i++) {
			randomDizi[i] = rand.nextInt(100);
			
			if( randomDizi[i] %2 == 0) {
				System.out.println("Dizinin " + (i+1) + ". elemaný cift sayi");
			}
			else {
				System.out.println("Dizinin " + (i+1) + ". elemaný tek sayi");
			}
		}
		   
	}

}
