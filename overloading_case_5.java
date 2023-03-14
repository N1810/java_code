package Neeraj;

public class overloading_case_5 {
	public void m1(int i, float f) {
		System.out.println("int-float version");
	}

	public void m1(float f, int i) {
		System.out.println("float-int version");
	}

	public static void main(String[] args) {
		overloading_case_5 o = new overloading_case_5();
		o.m1(10, (float) 10.5);
		o.m1(10.25f, 103);
	//	o.m1(10, 10);
		//o.m1(10.5f, 10.5f);
	}
}
