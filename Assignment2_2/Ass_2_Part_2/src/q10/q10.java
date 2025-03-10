package q10;
import java.util.*;
//Given an unsorted array of integers ranging from 1 to 10, write a program to find the 
//smallest positive number missing in the array. Use a HashMap<Integer, Integer> to 
//keep track of the elements and identify the missing number.
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {4,32,1,5,6,2,3};
		Arrays.sort(x);
		HashMap <Integer,Integer> ob=new HashMap<Integer,Integer> ();
		int i=x[0];
		for(int j=0;j<x.length;j++) {
		ob.put(i++, x[j]);
		}
	
	for(Integer key:ob.keySet()) {
		if(key!=ob.get(key)) {
			System.out.println(key++);
		break;
		}
		
	}

	}
}

