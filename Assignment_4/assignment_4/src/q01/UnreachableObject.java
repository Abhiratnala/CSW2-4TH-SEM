package q01;
import java.util.*;
public class UnreachableObject {
	String name;
	public UnreachableObject(String name) {
		this.name=name;
		System.out.println("obj create with name "+name);
	}
public void display() {
	UnreachableObject obj=new UnreachableObject("xyz");
}
public void show() {
	UnreachableObject obj2=new UnreachableObject("abc");
	display();
}
@Override 
protected void finalize() throws Throwable{
	System.out.println("garbag is collected");
	
}
	public static void main(String[] args) {
		UnreachableObject ob=new UnreachableObject("main obj");
		ob.show();// TODO Auto-generated method stub
ob=null;
System.gc();
	}

}
