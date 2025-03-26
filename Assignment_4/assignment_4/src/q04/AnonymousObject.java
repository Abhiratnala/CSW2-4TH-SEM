package q04;

public class AnonymousObject {
	String n;

	public AnonymousObject(String n) {
		this.n=n;
		
		// TODO Auto-generated constructor stub
	}
	@Override 
	protected void finalize() throws Throwable{
		System.out.println("garbage is collected "+n);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject("abc");
		new AnonymousObject("xyz");
		System.gc();
		
		

	}

}
