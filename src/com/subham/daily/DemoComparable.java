package com.subham.daily;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {

	public static void main(String[] args) {
		 ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(3, "Anisha"));
	        list.add(new Student(1, "Nikhil"));
	        list.add(new Student(2, "Jagu"));
	        Collections.sort(list);
	        for (Student s : list) {
	            System.out.println(s.id + " " + s.name);
	        }
	}	
}


class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }
    
    
}
