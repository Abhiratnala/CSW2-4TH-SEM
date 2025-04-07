package q14;
import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream ob=new FileInputStream("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q14\\input.txt");
        FileOutputStream ob2=new FileOutputStream("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q14\\output.txt");
        int i;
        while((i=ob.read())!=-1){
        	ob2.write((char)i);
        }
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
