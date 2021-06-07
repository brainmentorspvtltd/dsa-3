import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s="Silent";
        String s2="Lesten";
        
        if(s.length()==s2.length()){

        
        s=s.toLowerCase();
        s2=s2.toLowerCase();
        char c1[]=s.toCharArray();
        char c2[]=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean flag=true;
        for(int i=0;i<c1.length;i++){
                if(c1[i]==c2[i]){

                }
                else{
                    flag=false;
                    break;
                }
        }

        if(flag==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not anagram");
        }
        }
        else{
            System.out.println("not anagrams");
        }
    }
}
