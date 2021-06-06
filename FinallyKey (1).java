
public class FinallyKey {
   public static void main(String[] args) {
        
    try{
        int b=90;
        int c=80;
        int a=b/0;
    }
    catch(Exception e){
        System.out.println("hello  iam exception");
    }
    finally{
        System.out.println("hello  iam finally block");
    }
   } 
}
