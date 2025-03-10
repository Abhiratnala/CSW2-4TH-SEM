package q8;
//Write a Java program to determine whether two given strings are anagrams. An 
//anagram is a word or phrase formed by rearranging the letters of another word or 
//phrase. 
////Declare two strings, str1 and str2, and initialize them with values. Create a 
//<Character, Integer> to store the character frequencies of one string. Use 
//the methods containsKey(), put(), and get() to compare both strings and verify if they 
//are anagrams.
import java.util.*;
public class q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str1="aabc";
		String str2="abad";
		int c=0;
		HashMap<Character, Integer> ob=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			int f=0;
			for(int j=0;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j))
					f++;
				
			}
			char ch=str1.charAt(i);
			ob.put(ch, f);
		}
		for(int i=0;i<str2.length();i++)
		{
			if(ob.containsKey(str2.charAt(i))) {
				int f=0;
					for(int k=0;k<str2.length();k++) {
						if(str2.charAt(i)==str2.charAt(k))
							f++;
						}
					char ch=str2.charAt(i);
					if(! (ob.get(ch)==f)) {
					 c++;
						break;
					}
						
					}
			else {
				c++;
			}
						
		}
		if(c==0)
			System.out.println("anagrams");
		else
			System.out.println("not anagrams");
		
		

	}

}
