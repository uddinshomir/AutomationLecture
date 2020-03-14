package com.javabasics;

public class Tuna extends Fish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuna tuna1 = new Tuna();
		tuna1.blue();
		tuna1.swim();
		tuna1.sleep();
		eat(); 
		
	}
	
	public void blue() {
		System.out.println("I am blue");
	}
	
	@Override
	public void swim() {
		System.out.println("I am tuna that swims.");
	}
	


}
