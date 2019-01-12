package ExceptionHandling;

public class Exceptionhandler {
	
	public static void main(String[] args) {
	
		int a =0;
		int b =1;
		int c;
		
		try {
				c = b/a;
				
		}catch (ArithmeticException d) {
			System.out.println(d);
			d.printStackTrace();
		
		}catch(Exception e) {
			
			System.out.println("Error");
		}
		
		finally {
			System.out.println("Finally block executed successfully");
		}
	}

}
