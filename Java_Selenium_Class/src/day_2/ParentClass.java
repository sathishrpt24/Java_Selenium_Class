package day_2;
// Inheritance
public class ParentClass {
	
	private int A;
	private int B;
	private int C;

	public ParentClass(int a, int b,int c) {
		
		this.A = a;
		this.B = b;
		this.C = c;
		
		System.out.println("This is Parent class constructor");
	}

	public void add(int A, int B,int C) {
		
		System.out.println("Addition of two numbers:="+ (A+B+C));
	
	}
	public void subraction() {
		
		System.out.println("Parent class - Subraction of two numbers:="+ ((A+B)-C));
	
	}
	
	public void multi() {
		
		System.out.println("Printing the values of parent calss \n constructor assigned values passed from child class constrctor:"+(A*B*C));
	}
}
