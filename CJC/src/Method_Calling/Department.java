package Method_Calling;

public class Department {
	
	public void getDepartmentName() {
		System.out.println("Electronics & Tel-Communication");
	}
	public void dLocation() {
		System.out.println("Pune");
	}
	
	public static void main(String[] args) {
		Department dpt = new Department();
		dpt.getDepartmentName();
		dpt.dLocation();
	}
}

Runnable



Object
