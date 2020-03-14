package com.javabasics;

public class Salmon extends Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salmon salmon1 = new Salmon();
		salmon1.pink();
		salmon1.swim("salmon"); 
		salmon1.sleep();
		eat(); 
	}
	
	public void pink() {
		System.out.println("I am pink inside");
	}
	
	
	public void swim(String fish) {
	 System.out.println("I am " + fish + " that swims");
		
	}

}
