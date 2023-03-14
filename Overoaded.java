package Neeraj;

class Overload {

	// function having two parameters
	public int FunctionName(int a, int b) {
		return (a + b);
	}

    //same  function having three parameters
	public int FunctionName(int a, int b, int c) {
		return (a + b + c);
	}

     //Same function Having Double in Parameter
	public double FunctionName(double a, double b) {
		return (a + b);
	}
}

public class Overoaded {
	public static void main(String[] args) {
		Overload o = new Overload();

		System.out.println(o.FunctionName(10, 20));
		System.out.println(o.FunctionName(10.5, 20.3));
		System.out.println(o.FunctionName(5, 4, 8));
	}
}