package Practice;

import java.util.*;

//Write a Java program to divide two numbers and print on the screen.
public class Divide {
	public static void main(String[] args) {
		System.out.println("Enter The Divisor:-");
		Scanner sc = new Scanner(System.in);
		int Divisor = sc.nextInt();
		System.out.println("Enter The Dividend:-");
		int Dividend = sc.nextInt();
		System.out.println("Quotient is :- " + (Divisor / Dividend));

	}

}
