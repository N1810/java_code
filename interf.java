package Neeraj;

public interface interf {
	public void m1();

	public void m2();

	abstract class serviceprovider implements interf {
		public void m1() {

		}
	}

	class subserviceprovider extends serviceprovider {
		public void m2() {

		}
	}

}