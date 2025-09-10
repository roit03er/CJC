package Method_Calling;

public class B {
		public void Employee() {
			System.out.println("AAA");
			System.out.println(26);
			System.out.println("Pune");
		}
		
		public static void main(String[] args) {
			new B().Employee();
			
			B b = new B();
			b.Employee();
			b.Employee();
		}
}
