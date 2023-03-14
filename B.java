package Neeraj;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		int a = 'b';
		System.out.println(a);
		// Uppercase to lower Case
		String name = "IGNOU";
		System.out.println(name.toLowerCase());
		// LowerCase to Upper Case
		String n = "ignou";
		System.out.println(n.toUpperCase());
//		System.out.println(5 >> 1);
//		System.out.println(4 >> 2);
//		System.out.println(25 >> 5);
//		System.out.println(5 << 45);
//		System.out.println(25 << 5);
		System.out.println(0110 << 1);
 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (2 * i - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
