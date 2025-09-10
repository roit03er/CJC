package Method_Calling;

public class Student {
	
	public void getName() {
		System.out.println("Aakash");
	}
	public int  getAge() {
		return 26;
	}
	public void getLocation () {
		System.out.println("Pune");
	}
	
	public static void main(String[] args) {
	Student	stu = new Student();
	stu.getName();
	System.out.println(stu.getAge());
	stu.getLocation();
		
	}
}
