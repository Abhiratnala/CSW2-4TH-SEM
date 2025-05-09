package q06;
class Tickets{
	int available=100;
	public void bookSeat(int n) {
		available-=n;
		System.out.println("curr seats="+available);
		
	}
	public void cancelSeat(int n) {
		available+=n;
		System.out.println("curr seats="+available);
	}
	public void display() {
		System.out.println("available seats="+available);
}
public class q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets ob=new Tickets();
		Thread t1=new Thread(()->{  
			for(int i=1;i<3;i++) {
				ob.bookSeat(200);
				try {
					Thread.sleep(50);
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}}});
			Thread t2=new Thread(()->{  
			for(int i=1;i<3;i++) {
				ob.cancelSeat(200);
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


	}

}
