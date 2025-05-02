package q5;
import java.util.function.Function;
public class main {
public static Function<Integer,Integer> multiply(int f){
	return x-> x*f;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> multiplyref=multiply(5);
		System.out.println(multiplyref.apply(4));

	}

}
