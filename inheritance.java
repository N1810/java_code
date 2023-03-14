package Neeraj;

class par {
	public void m1() {
		System.out.println("Parent");
	}
}

class chi extends par {
	public void m2() {
		System.out.println("Child");
	}
}

public class inheritance {
	public static void main(String[] args) {
		par p = new par();
		chi c = new chi();
		p.m1();
		c.m1();
		c.m2();

	}
}
