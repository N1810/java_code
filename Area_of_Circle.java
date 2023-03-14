package Practice;

import java.util.*;

//Calculating Area of Circle
public class Area_of_Circle {

	public static void main(String[] args) {
		float pie = 3.14f;
		System.out.println("Enter the Radius of Circle:- ");
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float area = pie * radius * radius;
		System.out.println("Area Of Circle is:- " + area);

	}
}
