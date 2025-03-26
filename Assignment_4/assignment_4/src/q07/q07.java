package q07;
import java.util.*;
class student {
	public student(String name, String course, int roll) {
		super();
		this.name = name;
		this.course = course;
		this.roll = roll;
	}
	String name , course;
	int roll;

@Override 
protected void finalize() throws Throwable{
	System.out.println("garbage is collected");
	}
public String toString() {
	return(name+"  "+course+"   "+roll);
	
}


}
public class q07 {

	public static void main(String[] args) {
		ArrayList<student> obj=new ArrayList<>();
		student d1=new student("abc","cse",23);
		student d2=new student("adrfyc","cge",27);
		student d3=new student("abnc","cfe",26);
		obj.add(d1);
		obj.add(d2);
		obj.add(d3);
		d1=null;
		d3=null;
		System.gc();
		for(student s:obj ) {
			System.out.println(s.toString());
			
		}
		
		// TODO Auto-generated method stub

	}

}
