package q3;
import java.util.*;
public class car implements Comparable<car>{
	int modelNo, stock; String name;
	public car(int modelNo, int stock, String name) {
		this.modelNo = modelNo;
		this.stock = stock;
		this.name = name;
	}
	@Override
	public int compareTo(car c) {
		if(this.stock>c.stock)
		return 1;
		else if(this.stock<c.stock)
		return -1;
		else return 0;
	}
	@Override
	public String toString() {
		return (modelNo+" "+name+" "+stock);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
