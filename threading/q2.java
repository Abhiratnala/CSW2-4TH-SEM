package threading;

public class q2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			q2 ob=new q2();
			Thread t=new Thread(ob);
			t.start();
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("thread "+Thread.currentThread().getId()+ " is running");
		}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}

}
