package file_informtation;
import java.io.*;
public class q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuffer sb=new StringBuffer();
    int start=(int) System.nanoTime();
    for(int i=0;i<10000;i++) {
    	sb=sb.append(i);
    }
    int end=(int) System.nanoTime();
    int duration=(int) System.nanoTime();
    System.out.println(duration);
}
}
