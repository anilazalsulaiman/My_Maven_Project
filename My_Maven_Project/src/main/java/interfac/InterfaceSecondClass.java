package interfac;

public class InterfaceSecondClass implements InterfaceFirstClass,Interfacethirdclass{
	
	public void show() {
		System.out.println("Sample");
	}
	
	public static void main(String[] args) {
		InterfaceFirstClass obj=new InterfaceSecondClass();
		obj.showdetails();
		
		
		
		InterfaceSecondClass obj1=new InterfaceSecondClass();
		obj1.show();
		
		//Interfacethirdclass obj2=new InterfaceSecondClass();
		obj1.display();
	}

	public void showdetails() {
		System.out.println("hello world ");
		System.out.println("Static final variable: " +a);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sample program");
	}

}
