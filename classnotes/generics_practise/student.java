package generics_practise;

public class student <T,U> {
	T roll;U age;
	String n;
	public student(T roll, U age, String n) {

		this.roll = roll;
		this.age = age;
		this.n = n;
	}
	public T getroll() {
		return roll;
	}


	public static void main(String[] args) {
	student <Integer,String > ob1=new student(12,"34","serd");
	student <String,Integer> ob2=new student("23",24,"hdh");
	student <Integer,Integer> ob3=new student(25,24,"hdh");
	student <String,String> ob4=new student("26","24","hdh");
	
	System.out.println( ob1.getroll());
System.out.println(	ob2.getroll());
System.out.println(	ob3.getroll());
System.out.println(	ob4.getroll());
	
		// TODO Auto-generated method stub

	}

}
