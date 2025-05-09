package q01;
class Sum_thread extends Thread{
	int s=0;
	public void run() {
		try {
		for(int i=0;i<=100;i++) {
			s+=i;
			
		}
		System.out.println("sum= "+s);
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
class Multiplication_Thread extends Thread {
	int n;
	public Multiplication_Thread(int n) {
		this.n=n;
	}
	public void run() {
		try {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
	
}
}
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_thread ob=new Sum_thread();
		ob.start();
		Multiplication_Thread ob1=new Multiplication_Thread(5);
		ob1.start();
		Multiplication_Thread ob2=new Multiplication_Thread(6);
		ob2.start();//jumbled output
		

	}

}
