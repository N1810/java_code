package Practice;
import java.util.*;
//Write a Java program that takes two numbers as input and display the product of two numbers
public class Product {
	public static void main(String []args) {
		System.out.println("Enter The First Number:- ");
		Scanner sc= new Scanner(System.in);
		int first=sc.nextInt();
		System.out.println("Enter The Second Number:- ");
		int second=sc.nextInt();
		System.out.println("Product of The Given Number is:- "+(first*second));
	}

}
