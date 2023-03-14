package Neeraj;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("Neeraj");
		System.out.println(st.charAt(0));
		st.insert(0, 'K');
		st.setCharAt(1, 'i');
		st.deleteCharAt(2);
		System.out.println(st);
		StringBuilder sb = new StringBuilder("H");
		sb.append('e');
		sb.append('l');
		sb.append('l');
		sb.append('o');
		System.out.println(sb);
	}

}
