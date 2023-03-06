package Encapsulation;

public class FirstClass {
private String name;
private int age;

public void getName() {
	System.out.println(name);
	System.err.println(age);
}
public void setName(String name,int age) {
	this.name=name;
	this.age=age;
}
}
