package q1;
import java.util.*;
public class q07 implements Comparator<q07> {
	String name;
	int roll,age;
	public q07(String name, int roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	@Override
	public int compare(q07 o1, q07 o2) {
		return o1.roll-o2.roll;
			
		 
	}
	
	@Override
	public String toString() {
		return (this.name+"  "+this.roll+" "+this.age);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		
		q07 students[]=new q07[3];
	
		for(int i=0;i<students.length;i++) {
			System.out.println("enter");
			String n=in.next();
			int  r=in.nextInt();
			int a=in.nextInt();
	      students[i]=new q07(n,r,a);
		}
		Arrays.sort(students, new q07("", 0, 0));
		for(int i1=0;i1<students.length;i1++) {
		System.out.println( students[i1].toString());
		
			
		}
		
	}

	
	
	
}
	
