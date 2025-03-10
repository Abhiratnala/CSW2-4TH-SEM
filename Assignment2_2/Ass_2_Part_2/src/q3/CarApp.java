package q3;
import java.util.*;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<car> ob=new ArrayList<>();
		ob.add(new car(2013 , 10,"Creta"));
		ob.add(new car(2013 , 30,"Creta"));
		ob.add(new car(2013 , 7,"Creta"));
		ob.add(new car(2013 , 5,"Creta"));
	    ob.sort(null);
         Collections.sort(ob);
         for(car c:ob) {
        	 System.out.println(c.toString());
         }
         
           
		

	}

}
