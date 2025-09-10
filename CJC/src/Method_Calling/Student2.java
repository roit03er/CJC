package Method_Calling;

public class Student2 {
	
	public String getName() {
		return "Rohit Patil";
	}
	public int getAge() {
		return 21;
	}
	public String getLocation() {
		return "Mumbai";
	}
	
	public static void main(String[] args) {
		Student2 stu2 = new Student2();
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		System.out.println(stu2.getLocation());
	}
}
