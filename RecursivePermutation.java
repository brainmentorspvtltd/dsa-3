package recursion;

public class RecursivePermutation {
   
        // static void powerSet(String str, String subset)
        // {
    
        //     if(subset.length()==2)
        //     {
        //         System.out.println(subset);
        //         return;
        //     }
        //     // for(int i=0;i<str.length();i++)
        //     // {
        //         powerSet(str, subset+str.charAt(0));
        //         powerSet(str, subset+str.charAt(1));
        //         powerSet(str, subset+str.charAt(2));
        //         powerSet(str, subset+str.charAt(3));
    
        // }
        static int permutationString(String str, String stFormulated){

            if(stFormulated.length() == 3){
            System.out.println(stFormulated);
            return 1;
            }
            int newcount=0;
            for(int i=0; i<str.length(); i++){
            newcount = newcount+permutationString(str,stFormulated+str.charAt(i));
            }
            return newcount;
            
            };
        public static void main(String[] args) {
            String st = "ab";
            int count=0;
            count = permutationString(st, "");
            System.out.println(count);
           // powerSet("abcd","");
        }
    }

