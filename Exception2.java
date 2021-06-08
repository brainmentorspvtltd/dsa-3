import java.io.File;
import java.io.IOException;
public class Exception2 {
    static void write () throws IOException{
        System.out.println("iam in write");
        File f=new File("abc/abc.txt");
       // try{
        f.createNewFile();
        // }
        // catch(IOException e){
        //     System.out.println("i have handled this exceprion");
        // }
        //int a=90/0;
        // try{
        // int i=90/0;//Exception object 
        // }
        // catch(Exception e){
        //     System.out.println("there is some error in write");
        // }
        System.out.println("iam going out of write");
    }
    static void read() throws IOException{
        System.out.println("iam in read");
       write();
        // try{
        // write();
        // }
        // catch(Exception e){
        //     System.out.println("iam read  and handling write's problem ");
        // }
        System.out.println("iam going out of read");
    }
    public static void main(String[] args) throws IOException {//default exception handler=>jvm=>println
                System.out.println("iam in main");
        read();
        // try{
        // read();
        // }
        //  catch(Exception e){
        //      System.out.println("iam main and handling read's problem");
        //  }
        System.out.println("iam going out of main");
    }
}
