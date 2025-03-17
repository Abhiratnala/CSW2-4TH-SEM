package assignment_3;
class InvalidAge extends Exception{
	public InvalidAge(String s) {
		super(s);
	}
	
}
public class custom {
	public static void validate (int n) throws InvalidAge  {
		if(n<18) {
		
				throw new InvalidAge("not proper age");
	}
		else {
			System.out.println("valid");
		}
		
		
	}
	

	public static void main(String[] args) {
		try {
			validate(19);
			validate(10);
		}
		catch(InvalidAge e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
