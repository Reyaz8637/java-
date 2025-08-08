import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
public class Stream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C:/Myjava/Text,txt");
            String str="learn java programming";
            byte b[]=str.getBytes();
            fos.write(b,6,str.length()-6);
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
