package assignment_5;
import java.io.*;
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ob=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\assignment_5");
		if(!ob.exists() || !ob.isDirectory())
			System.out.println("does not exist");
		else {
			File[] f=ob.listFiles();
			if(f!=null) {
				for(File i:f) {
					System.out.println(i.getName()+" is a file :"+i.isFile()+" is a directory "+i.isDirectory());
					}
				for(File i:f) {
					if(i.isFile() && i.getName().endsWith(".txt")) {
						System.out.println("text file: "+i.getAbsolutePath());
					}
				}
				}
			}
		}

	}
