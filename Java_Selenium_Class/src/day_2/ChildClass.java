package day_2;
//Inheritance

public class ChildClass extends ParentClass {

	public ChildClass(int a, int b, int c) {
		super(20, 30, 40);
		// TODO Auto-generated constructor stub
	}

	public void add(int A,int B) {

		System.out.println("Child class -Addition of two numbers:=" + (A + B));

	}

	public void subraction() {

		System.out.println("Child class - Subraction of two numbers:=");
	
	}

	public static void main(String args[]) {
		
		ChildClass cc = new ChildClass(10, 5, 3);
		
		cc.add(10, 5);
		cc.add(10, 5,2); // Method Overloading
		cc.subraction(); // method Oveririding - Since Method has a same name in parent  and chidl class, child will be overided
		cc.multi();
	}

}