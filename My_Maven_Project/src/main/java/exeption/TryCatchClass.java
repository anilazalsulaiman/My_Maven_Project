package exeption;

public class TryCatchClass {
	
	public void showDoubleCatch() {
		try {
			
//			int result=10/0;
//			System.out.println("result in try block is: " +result);
			
//			int a[]= {1,2,3,4,5};
//			System.out.println(a[6]);
			
			String name=null;
			System.out.println(name.concat("a"));
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic value is not valid");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndex OutOfBound Exception occurs");
		} catch (Exception e) {
			System.out.println("Error occured");
		}
	}
	public static void main(String[] args) {
		TryCatchClass obj=new TryCatchClass();
		obj.showDoubleCatch();
	}
}
