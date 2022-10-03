package com.xworkz.bank;

public class ClassLoadTester {

	public static void main(String args[]) throws ClassNotFoundException {
		m1();
		m2();
//		try {
//			m1();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		try {
////			Class.forName("java.lang.package com.xworkz.bank");
////			}catch(ClassNotFoundException  e) {
////				System.out.println("file not being captured");
////			}
//		System.out.println("main method started");
//		
//		System.out.println("main method ended");
	}
	public static void m1( ) throws ClassNotFoundException{
		
		System.out.println("m1 method is started");
	
//		try {
//			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
		
	}
	
	public static void m2( ) {
		System.out.println("m2 method is created");
		
	}
}
