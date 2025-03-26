package file_informtation;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class c {
	  public static void main(String[]args){
		  try {
			  FileReader fr=new FileReader("example.txt"); 
			  int ch;
			  if((ch=fr.read())!=-1)
				  System.out.println(ch);
			  else
				  System.out.println("nothing");
			  fr.close();
		  }
		  catch(IOException e) {
		    	 System.out.println(e.getMessage());
		  
	  }

}
}
