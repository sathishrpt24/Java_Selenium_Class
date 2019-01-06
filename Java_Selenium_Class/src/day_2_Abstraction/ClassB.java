package day_2_Abstraction;

public class ClassB extends ClassA {
	
	@Override
	public void function2() {
		// TODO Auto-generated method stub
		
		System.out.println(" Abstract method- function-2 implmented in inherited class");
	}

	@Override
	public void function3() {
		// TODO Auto-generated method stub
		System.out.println(" Abstract method- function-3 implmented in inherited class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB cb = new ClassB();
		cb.function1();
		cb.function2();
		cb.function3();
	}



}
