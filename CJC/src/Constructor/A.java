package Constructor;

public class A {
	
	int age;
	String name;
	
	 A (int age , String name) {
		this.age=age;
		this.name=name;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public static void main(String[] args) {
		A a = new A(23, "Rohit Patil");
		a.display();
		
	}
}
