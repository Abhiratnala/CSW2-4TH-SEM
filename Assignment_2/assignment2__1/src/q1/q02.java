package q1;

class book{
	 int bookId, price ; String bookName;

	public book(int bookId, String bookName ,int p) {
		price=p;
		this.bookId = bookId;
		this.bookName = bookName;
	}
	@Override
	public boolean equals(Object o) {
		book ob= (book) o;
		 if( this.price==ob.price){
			 return true;
		 }
		 else
			 return false;
		 
	}
	public String toString()//preexisting method which we are redifining 
	{
		return (bookId+" "+bookName+" "+price);
	}
	 
	
 }
public class q02 {

	public static void main(String[] args) {
		book b1=new book(123,"abc",222);
		book b2=new book(123,"shx",222);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b1.equals(b2));
		
		// TODO Auto-generated method stub

	}

}
