package file_informtation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class fileCreate{
     public static void main(String[]args){
     try{
      File f=new File("example.txt");
      if(f.createNewFile()){
        System.out.println(f.getName());
        }else{
        System.out.println("it is not created");
        }
     }catch(IOException e) {
    	 System.out.println(e.getMessage());
     }

     }
}
