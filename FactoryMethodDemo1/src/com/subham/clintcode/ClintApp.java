package com.subham.clintcode;

import java.util.Scanner;

import com.subham.factoryCode.ModelsFactory;
import com.subham.tata.TATA;

public class ClintApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   Welcome to TATA Cars Services");
        System.out.println("====================================");

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be empty. Exiting application.");
            sc.close();
            return;
        }

        System.out.println("\nHello " + name + " 👋");
        System.out.println("Available Models:");
        System.out.println("Altroz | Curvv | Harrier | Nexon | Punch | Tiago");

        System.out.print("\nEnter the car model to view specifications: ");
        String modelName = sc.nextLine();

        try {
            TATA car = ModelsFactory.getModels(modelName);

            System.out.println("\nFetching car specifications...\n");
            car.getModel();

        } catch (IllegalArgumentException e) {
            System.out.println("\n❌ " + e.getMessage());
            System.out.println("Please enter a valid Tata car model.");
        }

        System.out.println("\nThank you for visiting TATA Cars Services!");
        System.out.println("Have a great day 🚗✨");

        sc.close();
    }
}
