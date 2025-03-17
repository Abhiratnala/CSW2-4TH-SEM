package assignment_3;

/*Implement a custom exception class named CustomNullPointerException that 
replicates the behavior of the standard NullPointerException. However, instead of 
relying on default error messages or null references, this custom exception should 
accept a String message as a constructor argument. Your task is to create this custom 
exception class and demonstrate its usage in a Java program*/
class CustomNullPointerException extends Exception{
	public CustomNullPointerException(String s) {
		super(s);
	}
	
}

public class q02 {
	public static void show(String s) throws CustomNullPointerException {
		if(s==null)
			throw new CustomNullPointerException("s is null");
		else
			System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	show(null);
}
catch(CustomNullPointerException e) {
	System.out.println(e.getMessage());
}
	}

}
