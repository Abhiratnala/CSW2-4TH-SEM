package assignment2_2;
import java.util.*;
class car implements Comparable <car>{
private int model, price;
	private String name;
	
	
	public car(int model, int price, String name) {
		super();
		this.model = model;
		this.price = price;
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override 
	public int compareTo(car ob) {
		if(this.price==ob.price) return 0;
		else if(this.price>ob.price) return 1;
		else
			return -1;
	}
}

	

	
	
	


