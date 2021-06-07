public class Palindrome {

    static boolean isPalindrome(String str){

        for(int i=0,j=str.length()-1;i<(str.length())/2;i++,j-- ){
                if(str.charAt(i)==str.charAt(j)){
                    continue;
                }
                else{
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abccba";
        String str2="aba";
        String str3="abcdcs";

       System.out.println( isPalindrome(str));
       System.out.println( isPalindrome(str2));
       System.out.println( isPalindrome(str3));
    }
}
