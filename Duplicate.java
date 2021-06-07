public class Duplicate {
    static StringBuffer RemoveDuplicates(StringBuffer sb){

        //char array 
        //sort
        //single array 
        //aaddgkgthghj
        //aaddggghhjkt


        //app-1
        // byte b[]=new byte[256];
        // for(int i=0;i<sb.length();i++){
        //     if(b[sb.charAt(i)]==0){
        //         b[sb.charAt(i)]=1;
        //     }
        // }

        // StringBuffer res=new StringBuffer();
        // for(int i=0;i<256;i++){
        //     if(b[i]==1){
        //         res=res.append((char)i);
        //     }
        // }
        // return res;
    } 
public static void main(String[] args) {
    StringBuffer str=new StringBuffer("aanntrefjkdhfgsk");

    System.out.println(RemoveDuplicates(str));
}
}
