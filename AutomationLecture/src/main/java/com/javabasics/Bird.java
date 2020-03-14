package com.javabasics;

public class Bird extends Animal {

	public static void main(String[] args) {
		
		Bird.eat();
		
		Bird pigeon = new Bird();
		pigeon.fly();
		

	}
	
	public void fly() {
		System.out.println("I will fly");
	}

}
