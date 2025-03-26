package q05;

public class q05 {
int v1; double v2;

	public q05(int v1, double v2) {
	this.v1 = v1;
	this.v2 = v2;
}
	public void update(int a,double b) {
		v1+=a;
		v2+=b;
		System.out.println(v1+"  "+v2);
	}

@Override 
protected void finalize() throws Throwable{
	System.out.println("garbage is collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x1=Runtime.getRuntime().totalMemory();
		long x2=Runtime.getRuntime().freeMemory();
		q05 a=new q05(3,7);
	
		a.update(5, 3);
		a=null;
		long y1=Runtime.getRuntime().totalMemory();
		long y2=Runtime.getRuntime().freeMemory();
	    
	System.out.println(x1+"  "+x2+"  "+y1+"  "+y2);
	System.gc();
		

	}

}
