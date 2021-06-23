package recursion;
/*

*/

//import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;

public class PermutationString {
    
   static void binaryNumber(int length,String num){

        if(num.length()==length){
            System.out.println(num);
            return;
        }
        // for(int i=0;i<=1;i++){
        //     binaryNumber(length, num+i);
        // }
    binaryNumber(length,num+"0");
    binaryNumber(length,num+"1");
    }








    static void noOneTogetherbinary(int n, String str){
        if(str.length()==n){
            System.out.println(str);
            return;
        }

        if(str.length()==0){//when string is empty
            noOneTogetherbinary(n,str+"1");
            noOneTogetherbinary(n,str+"0");
            return;
        }
        else if(str.charAt(str.length()-1)=='0'){
            noOneTogetherbinary(n,str+"1");
        }
        noOneTogetherbinary(n,str+"0");

    }
    public static void main(String[] args) {
        noOneTogetherbinary(4,"");
       // binaryNumber(4,"");
    }
}
