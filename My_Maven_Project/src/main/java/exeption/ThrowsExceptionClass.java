package exeption;

import java.io.IOException;

public class ThrowsExceptionClass {

	public void display() throws IOException {
		int a=10/0;
		System.out.println(a);
	}
	public void show() {
		try {
			display();
		} catch (Exception e) {
			System.out.println("Exeption catch");
		}
		
	}
	public static void main(String[] args) {
		ThrowsExceptionClass obj=new ThrowsExceptionClass();
		obj.show();
	}
}
