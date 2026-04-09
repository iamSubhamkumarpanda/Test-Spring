package com.subham.tatamodels;

import com.subham.tata.TATA;

public class Tata_Tiago implements TATA {
	public Tata_Tiago() {
		System.out.println("Loading Tata_Tiago Class....");
	}

	@Override
	public void getModel() {
		System.out.println("----- Tata Tiago Details -----");
		System.out.println("Model Name   : Tata Tiago");
		System.out.println("Type         : Hatchback");
		System.out.println("Engine       : Petrol / CNG / EV");
		System.out.println("Transmission : Manual / Automatic");
		System.out.println("Mileage      : 20 – 26 km/l");
		System.out.println("Safety       : 4 Star Global NCAP");
		System.out.println("Price Range  : ₹5.5 – ₹8.5 Lakh");
		System.out.println("--------------------------------");
	}
}
