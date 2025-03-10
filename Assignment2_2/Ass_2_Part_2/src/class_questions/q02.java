package class_questions;
import java.util.*;
public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> ob=new TreeSet<>();
		for(int i=0;i<10;i++) {
			int x=0 + (int)(Math.random() * ((20 - 0) + 1));
			ob.add(x);
		}
		for(int i:ob) {
			System.out.print(i+"   ");
		}
		System.out.println();
		System.out.println(ob.first());
		System.out.println(ob.last());
	System.out.println(	ob.pollFirst());
	ob.remove(4);
	System.out.println(ob.higher(9));
 System.out.println( ob.lower(4));
 System.out.println(ob);

	}

}
