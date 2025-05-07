package threading;

public class q3 extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("thread "+Thread.currentThread().getName()+ " is running");
			System.out.println("thread "+Thread.currentThread().getPriority()+ " is running");//priority
		}
			catch(Exception e) {
				System.out.println(e);
			}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
			q3 ob=new q3();
			ob.setName("first thread");
			ob.setPriority(MAX_PRIORITY);
			ob.start();
			
		

	}

}
