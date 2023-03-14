package Neeraj;

abstract class vehicles {
	public abstract int getnumberofwheels();

}

class Bike extends vehicles {

	@Override
	public int getnumberofwheels() {
		// TODO Auto-generated method stub
		return 2;
	}

}

public class vehicle {
	public static void main(String[] args) {
		Bike b = new Bike();
	System.out.println(b.getnumberofwheels());	
	}
}