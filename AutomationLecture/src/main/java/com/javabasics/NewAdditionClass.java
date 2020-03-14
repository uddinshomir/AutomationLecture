package com.javabasics;

public class NewAdditionClass extends AdditionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewAdditionClass obj = new NewAdditionClass();
		obj.add(2, 3, 4);
		obj.add(4, 4);
		

	}
	
	public void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	
	

}
