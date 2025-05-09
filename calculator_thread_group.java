package threading;
class Ao extends Thread{
	int a, b;String op;
	public Ao(ThreadGroup group,String name,int a,int b,String o) {
		super(group,name);
		this.a=a;
		this.b=b;
		op=o;
	}
	public void run() {
		switch(op) {
		case "+":
			System.out.println(a+b);
			break;
		case "-" :
		System.out.println(a-b);
		break;
		case "*":
			System.out.println((a*b));
			break;
		case "/":
			System.out.println((a/b));
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
public class calculator_thread_group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup obj =new ThreadGroup("My Thread Group");
		Thread t1=new Ao(obj,"addition",5,6,"+");
		t1.start();
		Thread t2=new Ao(obj,"substraction",5,6,"-");
		t2.start();
		Thread t3=new Ao(obj,"multiplication",5,6,"*");
		t3.start();
		Thread t4=new Ao(obj,"division",5,6,"/");
		t4.start();
		6666

	}

}
