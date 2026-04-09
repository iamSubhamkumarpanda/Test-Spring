package com.subham.tatamodels;

import com.subham.tata.TATA;

public class Tata_Punch implements TATA{
	 public Tata_Punch() {
	        System.out.println("Loading Tata_Punch Class....");
	    }

	    @Override
	    public void getModel() {
	        System.out.println("----- Tata Punch Details -----");
	        System.out.println("Model Name   : Tata Punch");
	        System.out.println("Type         : Micro SUV");
	        System.out.println("Engine       : 1.2L Petrol");
	        System.out.println("Transmission : Manual / Automatic");
	        System.out.println("Mileage      : 20 km/l");
	        System.out.println("Safety       : 5 Star Global NCAP");
	        System.out.println("Price Range  : ₹6 – ₹10 Lakh");
	        System.out.println("--------------------------------");
	    }
}
