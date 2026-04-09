package com.subham.factoryCode;

import com.subham.tata.TATA;
import com.subham.tatamodels.*;

public class ModelsFactory {

    public static TATA getModels(String nameOfCarByClient) {

        if (nameOfCarByClient == null || nameOfCarByClient.isBlank()) {
            throw new IllegalArgumentException("Car name cannot be empty");
        }

        String input = nameOfCarByClient.toLowerCase();

        if (input.contains("altroz")) {
            return new Tata_Altroz();
        }
        else if (input.contains("curvv")) {
            return new Tata_Curvv();
        }
        else if (input.contains("harrier") || input.contains("harear") || input.contains("harier")) {
            return new Tata_Harrier();
        }
        else if (input.contains("nexon") || input.contains("nex")) {
            return new Tata_Nexon();
        }
        else if (input.contains("punch")) {
            return new Tata_Punch();
        }
        else if (input.contains("tiago")) {
            return new Tata_Tiago();
        }
        else {
            throw new IllegalArgumentException("Invalid Tata car model: " + nameOfCarByClient);
        }
    }
}
