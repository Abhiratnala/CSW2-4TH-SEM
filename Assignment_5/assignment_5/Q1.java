package assignment_5;

public class Q1 {
	static int didgt(int input1) {
		 int x=input1; int xx=0;
	     int y=(int)(Math.log10(x)+1);
	     int arr[]=new int[y];
	     for(int i=0;i<y;i++){
	         arr[i]=input1%10;
	         input1/=10;
	     }
	     int i=0;int j=y-1;
	     while(i<j){
	         if(arr[i]==arr[j]){
	             i++; j--;
	         }
	           else{
	        if(arr[i+1]==arr[j])
	         return arr[i];
	             else if(arr[i]==arr[j-1])
	        return arr[j];
	         }
	     }
	     return -1;
	}
	public static void main(String[]args) {
		int x=12332;
		System.out.println(didgt(x));
	}

}
