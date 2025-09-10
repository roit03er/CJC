package Conditional_Statement_if_else;

import java.util.Scanner;

public class Positive_Or_Not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		if (num > 0) {
			System.out.println(num+" is Positive");
		}
		else {
			System.out.println(num+" is Negative");
		}
	}
}
