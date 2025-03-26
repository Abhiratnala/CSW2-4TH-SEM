package q02;

public class ReassigningReference {
	String n;

	public ReassigningReference(String n) {
		this.n=n;
		
		}
	@Override 
	protected void finalize() throws Throwable{
		System.out.println("garbage is collected");
		}
	public void display() {
		System.out.println("obj is displayed "+n);
	}

	public static void main(String[] args) {
		ReassigningReference ob1=new ReassigningReference("abc");
		ob1.display();
		
		ReassigningReference ob2=new ReassigningReference("xyz");
		ob1=ob2;
		ob1.display();
		ob2.display();
		System.gc();
	
	}

}
