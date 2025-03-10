
package q11;
import java.util.*;

public class q11 {
    public static void main(String[] args) {
		PriorityQueue <Integer> ob=new PriorityQueue<>();
		int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
		for(int i=0;i<arr.length;i++) {
			ob.add(arr[i]);
		}
		while (!ob.isEmpty()) {
            System.out.println(ob.poll());
        }
		// TODO Auto-generated method stub

	}

}
