package string;

public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder();
	System.out.println(	s1.append("hello world"));
	System.out.println(s1.insert(5, " good "));
	System.out.println(s1.replace(5, 10, "bad"));
	System.out.println(s1.delete(5, 10));
	System.out.println(s1.reverse());
	System.out.println(s1.substring(10));

	}

}
