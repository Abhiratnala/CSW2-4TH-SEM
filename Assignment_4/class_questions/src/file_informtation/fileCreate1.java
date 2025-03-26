package file_informtation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class fileCreate1{
     public static void main(String[]args){
     try{
      FileWriter fw=new FileWriter("example.txt");
      fw.write("hello stop talking");
      fw.close();
        System.out.println("appended successfully");
     }catch(IOException e) {
    	 System.out.println(e.getMessage());
     
     }
}
}



