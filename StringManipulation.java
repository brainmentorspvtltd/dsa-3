public class StringManipulation {
    public static void main(String[] args) {
        String s1="hello";
        String s3=new String("hello");
        System.out.println(s1.charAt(2));
        String s2=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s2.toLowerCase());
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        char ch[]=s1.toCharArray();
        for(char c:ch){
            System.out.println(c);
        }
        byte ba[]=s1.getBytes();
        for(byte b:ba){
            System.out.println(b);
        }

        String str="hello world hi ";
        String strarr[]=str.split(" ");
        for(String s:strarr){
            System.out.println(s);
        }
        String str2="    hello";
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println(s1.concat(str2));
        System.out.println(str.substring(6));//6-10
        System.out.println(str.contains("world"));
        System.out.println(str.length());
        System.out.println(str.replace("hello","world"));
        // System.out.println(str.replaceAll("\\w.*", "oooooo"));

        
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb.append("hello"));
        System.out.println(sb.capacity());
       // System.out.println(sb.reverse());
        System.out.println(sb.charAt(3));
        char charr[]=new char[10];
        sb.getChars(0, 5, charr, 0);
        for(char c:charr){
            System.out.println(c);
        }

    }
}
