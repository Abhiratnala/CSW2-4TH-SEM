package q06;
import java.util.function.Function;
public class main {
public static Function<Integer,Integer> multiply(){
	return x->{
		int res=1;
		for(int i=1;i<=x;i++) {
			res=res*i;
		}
		return res;
	};
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> multiplyref=multiply();
		System.out.println(multiplyref.apply(4));

	}

}

