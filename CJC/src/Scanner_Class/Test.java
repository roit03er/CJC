package Scanner_Class;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the No: ");
			int x = sc.nextInt();
			
			System.out.println("Enter the Name: ");
			String name= sc.next();
			
			System.out.println("Enter the Salary: ");
			float sl= sc.nextFloat();
			
			System.out.println(x);
			System.out.println(name);
			System.out.println(sl);
		}
}
