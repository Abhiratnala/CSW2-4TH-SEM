package q05;

public class Book {
	int id;
	String name,author; int quantity;


	public Book(int id, String name, String author, int quantity) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	public String toString() {
		return (id+" "+name+" "+author+" "+quantity);
	}
	

}
