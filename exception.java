package Neeraj;

public class exception {
	public static void main(String[]args) {
		//declaration
		int a,b;
		//Defination
	   a=5;
	   b=10;
	   try {
		System.out.println(b/a);
	} catch (Exception e) {
		System.out.println("can't divide by 0");
	}
	}

}
