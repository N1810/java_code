package Neeraj;

class Parent {
	public void property() {
		System.out.println("Land + Gold + cash");
	}

	public void marriage() {
		System.out.println("Arrange marriage");
	}

}

class Child extends Parent {
	public void marriage() {
		System.out.println("Love Marriage");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marriage();
		Child c = new Child();
		c.marriage();
		Parent p1 = new Child();
		p1.marriage();
	}
}
