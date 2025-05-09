package threading;
class BankAccount{
	private int balance=1000;
	public synchronized void deposit(int a) {
		balance+=a;
	
		System.out.println("balance deposit="+(balance));
	}
	public synchronized void withdrawl(int a) {
		balance-=a;
		System.out.println("balance withdrawl="+(balance));
	}
	public void display() {
		System.out.println(balance);
	}
}
public class process_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ob=new BankAccount();//balance is the shared resourse i.r balance =1000 for all obj
		//within contructor we r passing it
Thread t1=new Thread(()->{  
for(int i=1;i<3;i++) {
	ob.deposit(200);
	try {
		Thread.sleep(50);
	}
	catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}}});
Thread t2=new Thread(()->{  
for(int i=1;i<3;i++) {
	ob.withdrawl(200);
	try {
		Thread.sleep(50);
	}
	catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}}});
t1.start();
t2.start();
try {
	t1.join();
	t2.join();

}
catch(InterruptedException e) {
	System.out.println(e.getMessage());
}
ob.display();
	}

}
