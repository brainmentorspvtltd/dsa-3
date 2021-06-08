public class Exception3 {

    public static void main(String[] args) {
        try{
            //runtime 
            // int a=90/0;
            // String str="aaaa";
            // str=null;
            // str.length();

            // int arr[]=new int[10];
            // System.out.println(arr[90]);
        }  
        catch(ArithmeticException a){
            System.out.println("Airithmetic exc");
        }  
        catch(NullPointerException n){
            System.out.println("Null pointer exc");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array index out of bound exc");
        }
        catch(Exception e){
            System.out.println("anonymous exc");
        }
        finally{
            System.out.println("clean resounces...free/clean up");
        }



    }
}
