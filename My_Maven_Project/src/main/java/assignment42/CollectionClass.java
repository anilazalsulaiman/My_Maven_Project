package assignment42;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionClass {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Green");
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Black");
		System.out.println(obj);
		System.out.println(obj.get(1));
		System.out.println(obj.remove(3));
		System.out.println(obj.contains("Red"));
		
		Iterator obj1=obj.iterator();
		while(obj1.hasNext()) {
			System.out.println(obj1.next());
		}
	}

}
