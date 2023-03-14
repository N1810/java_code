package Neeraj;

public class TestSign {
	public void m1(String s) {
		System.out.println("String Version");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer Version");
	}

	public static void main(String[] args) {
		TestSign ts = new TestSign();
		ts.m1("Neeraj");
		ts.m1(new StringBuffer("Neeraj"));
//		ts.m1(null);

	}

}
