
class AgeException extends Exception{
    AgeException(){
        super("Age not valid");
    }
    AgeException(String s){
        super(s);
    }
}

public class CustomizedException {
    public static void main(String[] args) {
    
        String name="Aman";
        int age=23;
            try{
                if(age<25){
                    AgeException a=new AgeException(name+": Sorry, your age not valid");
                    throw a;
                }
            }
            catch(AgeException a){
                System.out.println(a.getMessage());
            }
        }
}
