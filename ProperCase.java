public class ProperCase {
    static String properCase(String s){

        if(s.charAt(0)>='a'&& s.charAt(0)<='z'){
            
            String r=""+s.charAt(0);
            r=r.toUpperCase();
            s=r+s.substring(1);
        }

        for(int i=1;i<s.length();i++){

// if(Character.isUpperCase(s.charAt(i))){
//    s= s.substring(0, i)+Character.toLowerCase(s.charAt(i))+s.substring(i+1);
// }
            
            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                String r=""+s.charAt(i);
                r=r.toLowerCase();
                s=s.substring(0, i)+r+s.substring(i+1);
            }
        }
        return s;
    }
    static StringBuffer convertToProperCase(String str){

        String strarr[]=str.split(" ");

        StringBuffer sbresult=new StringBuffer(); 
        for(String str2:strarr){
            String sb=properCase(str2);
            sbresult=sbresult.append(sb+" ");
        }
        return sbresult;
    }
    public static void main(String[] args) {
        String s="Hi My Name Is Ram";
        String s2="hi MY naMe iS ram";

        StringBuffer str=convertToProperCase(s);
        System.out.println(str);
        StringBuffer str2=convertToProperCase(s2);
        System.out.println(str2);
    }
}
