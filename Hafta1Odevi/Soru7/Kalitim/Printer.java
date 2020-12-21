package com.Hafta1Odevi.Soru7.Kalitim;

public class Printer extends Report {
	
	public static void print(Report r) {
		System.out.println("Name: " + r.getName());
		System.out.println("Result: " + r.getResult());
		System.out.println("Date: " + r.getCreateDate());
	}

}
