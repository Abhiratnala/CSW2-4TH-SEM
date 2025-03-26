package string;

public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello world";
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='e')
				c++;
			
		}
		System.out.println(c);
	}

}
