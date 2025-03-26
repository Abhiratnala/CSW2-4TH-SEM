package file_informtation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class b{
     public static void main(String[]args){
    	 try{
    	      File f=new File("example.txt");
    	      if(f.delete()){
    	        System.out.println(f.getName()+"got deleted");
    	        }else{
    	        System.out.println("it is not deleted");
    	        }
    	 }
    	     catch(Exception e) {
    	    	 System.out.println(e.getMessage());
    	     }
}
}

