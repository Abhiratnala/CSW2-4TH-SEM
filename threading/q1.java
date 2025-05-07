package threading;

public class q1 extends Thread {
	public void run() {
		try {
		System.out.println("thread "+Thread.currentThread().getId()+ " is running");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			q1 obj=new q1();//obj==thread
			obj.start();//start calls run 
			
		}

	}

}
