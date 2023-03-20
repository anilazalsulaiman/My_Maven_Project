package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestCollectionClass {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("grape");
		//System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.get(2));
		System.out.println(list.contains("orange"));
		
		
		//using for each
//		for(String fruits:list) { 
//			System.out.println(fruits);
//		}
		
		//using iterator for traversal
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("pineapple");
//		
		list.contains(list.addAll(list1));
//		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
