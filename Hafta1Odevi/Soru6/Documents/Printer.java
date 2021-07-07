package com.Hafta1Odevi.Soru6.Documents;

public class Printer {

	// static olarak tanimlanmalari gerekiyor
	//b�ylece Application sinifindan class name ile eri�ilebilinmeli.
	
	//Application class�nda main metodu static oldugu icin 
	//Printer sinifindaki metoda erisebilmek icin onun da static olmas� gerekmektedir
	
	public static void	printPDFDocument() {
		
		PDFDocument pdf = new PDFDocument("Melek'in pdf belgesi");		
		System.out.println(pdf.getBody());	
	}
	
	public static void	printWordDocument() {
		
		WordDocument word = new WordDocument("Melek'in word belgesi");		
		System.out.println(word.getBody());
	}

}
