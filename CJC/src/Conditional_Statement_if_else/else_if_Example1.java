package Conditional_Statement_if_else;

// wap to check given number is positive negative or zero
public class else_if_Example1 {

	public static void main(String[] args) {

		int num = 25;
		if (num > 0)
		{
			System.out.println(num + " is Positive");
		} 
		else if (num < 0) 
		{
			System.out.println(num + " is Negative");
		} else 
		{
			System.out.println(num + " is Zero");
		}
	}
}
