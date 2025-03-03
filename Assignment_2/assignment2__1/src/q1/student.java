package q1;

public class student <T> {
	String name;
	T roll;
	int age;
	public student(String name, T roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getRoll() {
		return roll;
	}
	public void setRoll(T roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
