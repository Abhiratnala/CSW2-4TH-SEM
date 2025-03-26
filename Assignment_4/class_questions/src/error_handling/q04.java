package error_handling;
import java.io.*;
public class q04 {
public static void FileCHeck() throws FileNotFoundException{
	FileReader ob=new FileReader("/class_questions/src/error_handling/abc.txt");
	BufferedReader bf=new BufferedReader(ob);
	System.out.println("file found");
	//throw new FileNotFoundException("file not found");
	
}

	public static void main(String[] args) {
	try {
		FileCHeck();
		
	}
	catch(FileNotFoundException e){
		System.out.println("erroe handled");
		
	}
		// TODO Auto-generated method stub

	}

}
