package file_informtation;
import java.io.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String");
    String s="abc";
    int start=(int) System.nanoTime();
    for(int i=0;i<10000;i++) {
    	s=s+i;
    }
    int end=(int) System.nanoTime();
    int duration=(int) System.nanoTime();
    System.out.println(duration);
    System.out.println();
    
    System.out.println("StringBuilder");
    StringBuilder sb=new StringBuilder();
    int start1=(int) System.nanoTime();
    for(int i=0;i<10000;i++) {
    	sb=sb.append(i);
    }
    int end1=(int) System.nanoTime();
    int duration1=(int) System.nanoTime();
    System.out.println(duration1);
    System.out.println();
    
    System.out.println("StringBuffer");
    StringBuffer sbu=new StringBuffer();
    int start2=(int) System.nanoTime();
    for(int i=0;i<10000;i++) {
    	sb=sb.append(i);
    }
    int end2=(int) System.nanoTime();
    int duration2=(int) System.nanoTime();
    System.out.println(duration2);
	}

}
