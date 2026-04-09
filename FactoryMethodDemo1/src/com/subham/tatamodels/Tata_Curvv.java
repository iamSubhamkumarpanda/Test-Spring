package com.subham.tatamodels;

import com.subham.tata.TATA;

public class Tata_Curvv implements TATA {
	public Tata_Curvv() {
		System.out.println("Loading Tata_Curvv Class....");
	}

	@Override
	public void getModel() {
		System.out.println("----- Tata Curvv Details -----");
		System.out.println("Model Name   : Tata Curvv");
		System.out.println("Type         : Coupe SUV");
		System.out.println("Engine       : Petrol / Electric (EV)");
		System.out.println("Transmission : Automatic");
		System.out.println("Mileage      : 17 km/l (Petrol)");
		System.out.println("Range (EV)   : ~500 km");
		System.out.println("Price Range  : ₹10 – ₹19 Lakh (Expected)");
		System.out.println("--------------------------------");
	}
}
