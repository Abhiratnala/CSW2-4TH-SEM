package q7;
import java.util.*;
public class Address {
     int plotN, at, post;

	public Address(int plotN, int at, int post) {
		super();
		this.plotN = plotN;
		this.at = at;
		this.post = post;
	}
	@Override
	public String toString() {
		return (plotN+" "+at+" "+post);
	}
	public static void main(String args[]) {
	TreeMap<String,Address> o=new TreeMap<String,Address>();
    o.put("abc",new Address(12,23,22));
    o.put("cbd",new Address(13,33,12));
    o.put("def",new Address(11,24,38));
Set set1=o.entrySet();
Iterator itr=set1.iterator();
while(itr.hasNext()) {
	Map.Entry x=(Map.Entry)itr.next();
	System.out.println(x.getKey()+" "+x.getValue().toString());
}
    
	
	

}
}
