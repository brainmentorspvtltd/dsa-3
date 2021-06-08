//import java.nio.file.attribute.FileTime;
import java.io.File;
import java.io.IOException;
public class StackTrace {
    // static void funct2(){
    //     try{
    //     int a=90/0;
   
    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //         System.exit(0);
    //        // return ;//out stack=>control given back to caller 
    //     }
    //     finally{
    //         System.out.println("iam in finally");
    //     }
    //     System.out.println("iam in funct2");
    // }
    // static void fucnt1(){
        
    //     funct2();
    //     System.out.println("iam in func1");
    // } 
   
    public static void main(String[] args)  {


        File f=new File("abc/abc.txt");

        try{
        f.createNewFile();
        System.out.println("file created");
        }
        catch(IOException i){
           System.out.println("file cant be created");
        }
        finally{
            f.delete();
        }
        //fucnt1();
    }
}
