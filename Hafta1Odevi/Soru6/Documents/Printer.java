package com.Hafta1Odevi.Soru6.Documents;

public class Printer {

	// static olarak tanimlanmalari gerekiyor
	//böylece Application sinifindan class name ile eriþilebilinmeli.
	
	//Application classýnda main metodu static oldugu icin 
	//Printer sinifindaki metoda erisebilmek icin onun da static olmasý gerekmektedir
	
	public static void	printPDFDocument() {
		
		PDFDocument pdf = new PDFDocument("Melek'in pdf belgesi");		
		System.out.println(pdf.getBody());	
	}
	
	public static void	printWordDocument() {
		
		WordDocument word = new WordDocument("Melek'in word belgesi");		
		System.out.println(word.getBody());
	}

}
