package assignment_5;
import java.io.*;
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ob=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q14");
		File [] f=ob.listFiles();
		if(f!=null) {
			for(File i:f) {
				System.out.println(i.getAbsolutePath()+ " "+i.getName()+"  "+i.lastModified()+" "+i.length());
			}
		}
		
		

	}

}
