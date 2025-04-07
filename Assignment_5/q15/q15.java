package q15;
import java.io.*;
public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File f=new File ("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q15\\curr_name.txt");
       File s=new File ("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q15\\new_name.txt");
       System.out.println("Rename :"+f.renameTo(s));
	}

}
