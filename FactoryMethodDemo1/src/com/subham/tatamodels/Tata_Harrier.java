package com.subham.tatamodels;

import com.subham.tata.TATA;

public class Tata_Harrier implements TATA {

	public Tata_Harrier() {
		System.out.println("Loading Tata_Harrier Class....");
	}

	@Override
	public void getModel() {
		System.out.println("----- Tata Harrier Details -----");
		System.out.println("Model Name   : Tata Harrier");
		System.out.println("Type         : Mid-size SUV");
		System.out.println("Engine       : 2.0L Diesel");
		System.out.println("Transmission : Manual / Automatic");
		System.out.println("Mileage      : 16.8 km/l");
		System.out.println("Safety       : 5 Star Global NCAP");
		System.out.println("Price Range  : ₹15 – ₹25 Lakh");
		System.out.println("--------------------------------");
	}
}
