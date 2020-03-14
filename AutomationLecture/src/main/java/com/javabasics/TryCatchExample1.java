package com.javabasics;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 ,num3 , num4 ;
	      try {
	         /* We suspect that this block of statement can throw 
	          * exception so we handled it by placing these statements
	          * inside try and handled the exception in catch block
	          */
	         num1 = 0;
	         num2 = 62 / num1;
	         num3 = 50;
	         num4 = num3/10; 
	         System.out.println(num2);
	         System.out.println(num4);
	         System.out.println("Hey I'm at the end of try block");
	      }
	      catch (Exception e) {
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	      }
	      System.out.println("I'm out of try-catch block in Java.");

	}

}
