package Neeraj;

class Animal {

}

class Monkey extends Animal {

}

public class Overloading_case_6 {
	public void m1(Animal a) {
		System.out.println("Animal version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		Overloading_case_6 o = new Overloading_case_6();
		Animal a = new Animal();
		o.m1(a);
		Monkey m = new Monkey();
		o.m1(m);
		Animal a1 = new Monkey();
		o.m1(a1);
	}
}
