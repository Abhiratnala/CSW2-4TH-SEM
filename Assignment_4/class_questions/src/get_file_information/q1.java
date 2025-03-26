package get_file_information;
import java.io.File;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ob=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\class_questions\\src\\get_file_information\\abc.txt");
if(ob.exists())
	System.out.println("present");
else
	System.out.println("not present");
}

}
