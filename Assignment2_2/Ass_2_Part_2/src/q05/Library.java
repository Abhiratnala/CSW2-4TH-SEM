package q05;
import java.util.*;
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book> ob=new HashMap<>();
		Book b1=new Book(1,"The Kite Runner", "Khalid Hussain",2);
		Book b2=new Book(2,"Twisted Games","Ana Huang",1);
		Book b3=new Book(3, "Painted Scars","Neva Altaj",4);
		ob.put(b1.id,b1);
		ob.put(b2.id,b2);
		ob.put(b3.id,b3);
		Book b4=new Book(2,"Twisted Games","Ana Huang",1);
		System.out.println(ob.containsValue(b1));
		ob.remove(3);
		for(Integer i:ob.keySet()) {
			System.out.println(ob.get(i).toString());
			
		}

	}

}
