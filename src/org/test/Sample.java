package org.test;

public class Sample {
	public Sample() { 
	this(300);
	
		System.out.println("default construction");
	}
	public Sample(int id ) {
	this("Preethi", 8825);
	System.out.println("int para constructor");
	System.out.println(id);
}
	public Sample(String name, long phone) {
		System.out.println("String long para constructed");
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
	}

}
