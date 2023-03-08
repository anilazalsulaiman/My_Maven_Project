package exeption;

public class ExeptionClass {
	
	public void result() {
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("hi wolrd");
		}
		
	}
	public static void main(String[] args) {
		ExeptionClass obj=new ExeptionClass();
		obj.result();
		
		
		
	}

}
