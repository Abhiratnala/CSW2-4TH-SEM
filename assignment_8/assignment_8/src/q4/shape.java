package q4;

public interface shape {
	double area(int r);
	 default void printArea(int r) {
		 System.out.println(area(r));
		 
		
	}

}
