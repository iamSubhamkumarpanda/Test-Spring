package com.subham.Connections;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserDemo implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\subham.kp\\eclipse-workspace\\Daily\\src\\com\\subham\\Connections\\SeriDem";

		try {
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream oi = new ObjectInputStream(fi);
			System.out.println(oi.readObject());
			fi.close();
			oi.close();
			System.out.println("Object Read Sucessfully");
		} catch (Exception e) {
			System.out.println("Faild to Create FileoUTPUTStreem Objects.");
		}
	}

}
