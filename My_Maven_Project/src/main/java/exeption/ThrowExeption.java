package exeption;

public class ThrowExeption {
	int a=17;
	public void exeption() {
		if(a<18) {
			throw new ArithmeticException("invalid age");
		}else {
			System.out.println("Valid age");
		}
	}
public static void main(String[] args) {
	ThrowExeption obj=new ThrowExeption();
	obj.exeption();
}
}
