package string;
import java.util.*;
public class q04 {
int max=-1;
	/* public void maximum(int c) { 
	if(c>max)
		max=c;
}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q04 a=new q04();
		HashMap <Character,Integer> ob=new HashMap<>();
		String s1="aba";
		char ch;
		for(int i=0;i<s1.length();i++) {
			 ch=s1.charAt(i);
			if(ob.containsKey(ch)) {
				ob.put(ch,ob.get(ch)+1);
			}
			else
			ob.put(ch,1);
		}
		int max=-1;
		Set set1=ob.entrySet();
		Iterator itr=set1.iterator();
		while(itr.hasNext()) {
			Map.Entry x=(Map.Entry)itr.next();
			int c=(int) x.getValue();
			if(c>max) {
				max=c;
			}
			
		}

for(Character c:ob.keySet()) {
	if(ob.get(c)==max) {
		System.out.println(c+"   "+ob.get(c));
	}
}
a

		
		
		/*
		 * String s="aba"; int c=0; for(int i=0;i<s.length();i++) { c=0; for(int
		 * j=0;j<s.length();j++) { if (s.charAt(i)==s.charAt(j)) c++; } a.maximum(c);
		 * 
		 * 
		 * } System.out.println(max);
		 */
	}

}
