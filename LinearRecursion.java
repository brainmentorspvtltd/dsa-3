
public class LinearRecursion {

    //5 4 3 2 1 1 2 3 4 5
    static void printNumber(int n){

        if(n==0)
        return;
        System.out.println(n);
        printNumber(n-1);
        System.out.println(n);

    }
      //5 4 3 2 1  2 3 4 5
    static void printNumber2(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
       
        System.out.println(n);
        printNumber(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        printNumber(5);
    }
}
