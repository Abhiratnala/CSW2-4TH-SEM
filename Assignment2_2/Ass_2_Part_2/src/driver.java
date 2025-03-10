package assignment2_2;
import java.util.*;
public class driver extends car{

	public static void main(String[] args) {
		car cars[]=new car[3];
		ArrayList <car> ob=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<cars.length;i++) {
			System.out.println("enter");
			int m=in.nextInt();
			int p=in.nextInt();
			String n=in.next();
			cars[i]=new car(m,p,n);
		}
		
		/*
		 * for (int i = 0; i < cars.length - 1; i++) {
		 * 
		 * for (int j = 0; j < cars.length - i - 1; j++) { //if (cars[j].getPrice() >
		 * cars[j + 1].getPrice()) { if(cars[j].price) car temp = cars[j]; cars[j] =
		 * cars[j + 1]; cars[j + 1] = temp;
		 * 
		 * } } }
		 */
            for(int i=0;i<cars.length;i++) {
            	ob.add(cars[i]);
            	}
            Collections.sort(ob); //comparing using compareTo
            for(car o:ob) {
            	System.out.println(o.getModel()+"  "+o.getName()+"  "+o.getPrice());
            }
		
		
		
		
		// TODO Auto-generated method stub

	}

}
