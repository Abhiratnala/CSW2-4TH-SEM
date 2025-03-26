package class_questions;
import java.util.*;
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {1,1,2,2,3,4,5,6,7,7};
		HashSet <Integer> ob=new HashSet<>();
		HashSet <Integer> ob1=new HashSet<>();
		for(int i:x) {
			if(ob.contains(i)) {
				System.out.println(i);
				ob1.add(i);
				
			}
			else
				ob.add(i);
		}
		System.out.println(ob);
		System.out.println(ob1);
		Arrays.sort(x);
        for(int i=0;i<x.length-1;i++) {
        	if (x[i]==x[i+1]) {
        		System.out.println(x[i]);
        		continue;
        	}
        }
	}

}
