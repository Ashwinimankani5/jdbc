package com.xworkz.bank;

public class String1 {
	
	
	public static void main(String args[])
	{ long i = 555888877L;

	
		System.out.println("main method started");
		
		try{
			
			int y = 54/0 ;
	 
		Long.parseLong("i");
		//System.out.println(i);
		}catch(NumberFormatException |ArithmeticException exception) {
			exception.printStackTrace();
		System.out.println(i);
		
		}catch(	Exception ae ) {
			ae.printStackTrace();
		System.out.println("main method ended");
		}
	}
}


