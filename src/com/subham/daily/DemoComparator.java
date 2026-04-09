package com.subham.daily;

import java.util.*;

public class DemoComparator {
	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<>();

		list.add(new Student1(1, "Anisha", 85));
		list.add(new Student1(2, "Nikhil", 75));
		list.add(new Student1(3, "Jagu", 90));

		// Sort by Name
		Collections.sort(list, new NameComparator());

		System.out.println("Sort by Name:");
		for (Student1 s : list) {
			System.out.println(s.name + " " + s.marks);
		}

		// Sort by Marks
		Collections.sort(list, new MarksComparator());

		System.out.println("\nSort by Marks:");
		for (Student1 s : list) {
			System.out.println(s.name + " " + s.marks);
		}
	}
}

// Student class
class Student1 {
	int id;
	String name;
	int marks;

	Student1(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

// Comparator by Name
class NameComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
}

// Comparator by Marks
class MarksComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.marks - s2.marks;
	}
}