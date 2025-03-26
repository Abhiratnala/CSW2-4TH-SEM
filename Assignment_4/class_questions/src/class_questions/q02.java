package class_questions;
import java.util.*;
public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> ob=new HashMap<Integer,String>();
		ob.put(1, "abcn");
		ob.put(2, "abc2");
		ob.put(3, "abc3");
		System.out.println(ob );
		System.out.println(ob.get(3));
		System.out.println(ob.remove(2));
		System.out.println(ob.containsKey(4));
		System.out.println(ob.containsValue("abcn"));
		System.out.println(ob);
		System.out.println();
		for(Integer key:ob.keySet()) {
			System.out.println("key= "+key+" value= "+ob.get(key));
		}
		

	}

}
