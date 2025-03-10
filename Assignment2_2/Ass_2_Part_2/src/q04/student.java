package Q_4;
import java.util.*;
public class student {
	String NAme;
	int Age;
	double Mark;
	
@Override
public boolean equals(Object o) {
	student s1=(student)o;
	if(this.NAme.equals(s1.NAme)&& this.Age==Age)
		return true;
		else
			return false;
	}
	

	public student(String nAme, int age, double mark) {
		super();
		NAme = nAme;
		Age = age;
		Mark = mark;
	}
	public String getNAme() {
		return NAme;
	}


	public void setNAme(String nAme) {
		NAme = nAme;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public double getMark() {
		return Mark;
	}


	public void setMark(double mark) {
		Mark = mark;
	}

public String toString() {
	return(this.NAme+"  "+this.Age+" "+this.Mark);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<student>S1=new LinkedList<>();
		S1.add(new student("Abhijeet",20,7));
		S1.add(new student("Abhignya",18,10));
		S1.add(new student("Sanket",18,8));
		S1.add(new student("Swayam",29,7));
		
		for(student j:S1) {
			System.out.println(j.toString());
		}
Scanner in=new Scanner(System.in);
System.out.println(  "enter name");
student o=new student(in.next(),0,0);
int c=0;
for(student j:S1) {
	if(j.equals(o)) {
		c++;
		break;
	}
}
if(c==1)
	System.out.println("found");
else
	System.out.println("not found");
}
	
}