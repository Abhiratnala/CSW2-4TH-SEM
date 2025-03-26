package string;
import java.util.*;
public class q03 {
	String s="hello world";
public  boolean isVowel(char c) {
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') { 
	countVowel(s,c);
		return true;
	}
	return false;
}
public static int countVowel(String s,char ch) {
	int c=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
			c++;
		}
	}
		return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ob=new ArrayList<>();
		q03 a=new q03();
		String s="hello world";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);           
			if(ob.contains(ch))
				continue;
			else {

			
			/*ob.add(s.charAt(i));
			int c=0;
			if(a.isVowel(ch)){
				for(int j=0;j<s.length();j++) {
					 c=countVowel(s,ch);
					
				}
		    	
		    	System.out.println(ch+"  "+c);
		    }
		}*/

	}

}
	}
}


