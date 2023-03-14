package Practice;

import java.util.*;

//Calculating perimeter of circle
public class Perimeter_of_circle {
	public static void main(String[] args) {
		float pie = 3.14f;
		System.out.println("Enter The Radius Of Circle:- ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double perimeter = (2 * 3.14) * (radius);
		System.out.println("Perimeter of circle is:- " + perimeter);
	}
}
