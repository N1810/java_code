package Practice;

import java.util.Scanner;
//Table Printing
public class First {
	public static void main(String []args) {
		int Table=1;
		System.out.println("Enter The Table:- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			Table=n*i;
			System.out.println(Table);
		}
		
	}

}
