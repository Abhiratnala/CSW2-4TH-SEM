package string;

public class q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="helloworld";
		System.out.println(s.substring(5));
		System.out.println(s.substring(0,5));
		String s1="this is a sentence";
		String words[]=s1.split(" ");
		for (String i:words) {
			System.out.println(i);
		}
		String s2=" Java Is a Programming languAge ";
		char c[]=s2.toCharArray();
		for (char i:c) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		//palindrome
		String s4="madam",m="";
		for(int i=0;i<s4.length();i++) {
			char ch=s4.charAt(i);
			m=ch+m;
		}
		
			System.out.println(s4.equals(m));
		

	}

}
