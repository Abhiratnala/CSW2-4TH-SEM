package class_questions;
import java.util.*;
public class q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> ob=new LinkedHashMap<>();
		ob.put(1, "val1");
		ob.put(2, "val2");
		ob.put(3, "val3");
		Set set1=ob.entrySet();
		Iterator itr=set1.iterator();
		while(itr.hasNext()) {
			Map.Entry x=(Map.Entry) itr.next();
			System.out.println(x.getKey()+"     "+x.getValue());
		}
		

	}

}
