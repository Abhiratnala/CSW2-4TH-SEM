package q02;
class Sum extends Thread{
	int a,b;
	public Sum(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		try {
		System.out.println("sum= "+(a+b));
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
class Sub extends Thread{
	int a,b;
	public Sub(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		try {
		System.out.println("sub= "+(a-b));
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
class mul extends Thread{
	int a,b;
	public mul(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		try {
		System.out.println("mul= "+(a*b));
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
class div extends Thread{
	int a,b;
	public div(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		try {
		System.out.println("div= "+(a/b));
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}

public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
