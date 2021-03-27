package week07;

public class Animal {

	int age =15;
	String name="Joe";
	
	 void sound() {
		System.out.println("Animals make sound");
	}
	public int add(int a, int b) {
		return a+b;
	
	}
	public Integer multiply(int a, int b) {
		return a*b;
	}
	public Animal create() {
		return new Animal();
	}
}
