package q03;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("abc");
		ob.add("de");
		ob.add("ADDDD");
	
		ob.sort((a, b) -> b.length() - a.length());
		System.out.println(ob);
		

	}

}
