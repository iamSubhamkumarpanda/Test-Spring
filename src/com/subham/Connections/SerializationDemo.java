package com.subham.Connections;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {

	public static void main(String[] args) {

		int sturollno = 12;
		String stunae = "Subham";

		String path = "C:\\Users\\subham.kp\\eclipse-workspace\\Daily\\src\\com\\subham\\Connections\\SeriDem";

		try {
			FileOutputStream fo = new FileOutputStream(path);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(sturollno);
			System.out.println("l");
			fo.close();
			oo.close();

		} catch (Exception e) {
			System.out.println("Faild to Create FileoUTPUTStreem Objects.");
		}
	}
}
