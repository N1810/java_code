package Practice;

import java.util.*;

//Simple calculator
public class Simple_calc {
	public static void main(String[] args) {
		System.out.println("Enter The First Value:-");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println("Enter The Operation You Wnat to Perform:- ");
		String op = sc.next();
		System.out.println("Enter The Second Number:- ");
		int second = sc.nextInt();
		switch (op) {
		case "+":
			System.out.println("Sum of The Given Number is :-" + (first + second));
			break;
		case "-":
			System.out.println("Subtract of the Given Number is:- " + (first - second));
			break;
		case "*":
			System.out.println("product Of the Given Number is:- " + (first * second));
			break;
		case "/":
			System.out.println("Quotient of The Given Number is:- " + (first / second));
			break;
		case "%":
			System.out.println("Remainder After Dividing the Number is :-"+(first%second));
			break;
		default:
			System.out.println("Wrong Operation please Input The Correct operation to perform");
		}

	}
}
