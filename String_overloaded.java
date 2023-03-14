package Neeraj;
class strover{
	public String Name(String n,String e) {
		return(n+e);
	}
	public String Name(String n,String e,String r) {
		return (n+e+r);
	}
}

public class String_overloaded {
	public static void main(String[]args) {
		strover s=new strover();
		System.out.println(s.Name("Neer", "aj"));
		System.out.println(s.Name("Nee", "raj", " Kumar"));
	}

}
