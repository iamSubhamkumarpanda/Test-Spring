package com.subham.tatamodels;

import com.subham.tata.TATA;

public class Tata_Nexon implements TATA{
	 public Tata_Nexon() {
	        System.out.println("Loading Tata_Nexon Class....");
	    }

	    @Override
	    public void getModel() {
	        System.out.println("----- Tata Nexon Details -----");
	        System.out.println("Model Name   : Tata Nexon");
	        System.out.println("Type         : Compact SUV");
	        System.out.println("Engine       : Petrol / Diesel / EV");
	        System.out.println("Transmission : Manual / Automatic");
	        System.out.println("Mileage      : 17 – 23 km/l");
	        System.out.println("Safety       : 5 Star Global NCAP");
	        System.out.println("Price Range  : ₹8 – ₹15 Lakh");
	        System.out.println("--------------------------------");
	    }
}
