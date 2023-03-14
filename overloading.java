package Neeraj;

class E {
	public void m1() {
		System.out.println("Hii");

	}

	public void m1(int i) {
		System.out.println("Int type Argument");
	}

	public void m1(float f) {
		System.out.println("Float Type argument");
	}
}

public class overloading {
	public static void main(String[] args) {
		E a = new E();
		a.m1();
		a.m1(25);
		a.m1(12.1f);
		a.m1('n');
		//a.m1(10.5);

	}

}
