package q06;


import java.util.*;
class User implements Comparable <User>
{
	private String Name;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		if(this.age>o.age)
		     return 1;
			else if(this.age==o.age)
				return 0;
			else
				return -1;
		}
		
	}

public class q06 {

	public static void main(String[] args) {
		 ArrayList<User> A_1 = new ArrayList<>();
	        A_1.add(new User("Abhijeet", 20));
	        A_1.add(new User("Abhignya", 18));
	        A_1.add(new User("Sanket", 19));

	        System.out.println("Before sorting:");
	        for (User  i : A_1) {
	            System.out.println("Name: " + i.getName() + " Age: " + i.getAge());
	        }

	        // Sort the ArrayList based on age
	       // sortUsersByAge(A_1);
	Collections.sort(A_1);
	        System.out.println("\nAfter sorting by age:");
	        for (User  i : A_1) {
	            System.out.println("Name: " + i.getName() + " Age: " + i.getAge());
	        }
	    }
		
		// TODO Auto-generated method stub

	}

}
