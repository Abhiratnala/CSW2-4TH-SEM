package q01;
//Create a generic class Pair<K, V> with private member variables key and value. The
//class should include a parameterized constructor and provide getter and setter methods
//for these attributes. In the main class, create and add objects of the Pair class, then
//retrieve and print the key-value pairs.
public class q01 {
	public static void main(String [] args) {
		
		Pair<Integer,Integer> o1=new Pair<Integer,Integer>(5,6);
	Pair<Integer,String> o2=new Pair<Integer,String>(5,"60");
	Pair<Integer,Double> o3=new Pair<Integer,Double>(5,9.0);
System.out.println("key="+	o1.getKey()+"  value"+o1.getValue());
System.out.println("key="+	o2.getKey()+"  value"+o2.getValue());
System.out.println("key="+	o3.getKey()+"  value"+o3.getValue());
   
	
	}
	

}
class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

	
}
