//strings =>array of characters
//lang =>String class =>final=>no inherit 
//String =>immutable =>String class
//cannot be modified 
public class StringsIntro {
    public static void main(String[] args) {
       

        StringBuilder strb=new StringBuilder();
        StringBuilder strb2=new StringBuilder(45);
        //synchronized=>lock=>one thread =>read=>one 
        
        StringBuffer sb3=new StringBuffer("fghjghj");
        StringBuffer sb2=new StringBuffer(40);
        System.out.println(sb2.capacity());
        StringBuffer sb=new StringBuffer();
        System.out.println("capacity "+sb.capacity()+" Length "+sb.length());
        sb.append("hello");
        // System.out.println("capacity "+sb.capacity()+" Length "+sb.length());
        // sb.append(" world world world");
        // System.out.println("capacity "+sb.capacity()+" Length "+sb.length());
        //sb.append(sb).append(sb);
        sb.append("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");//87
        sb.append("tree");

        System.out.println("capacity "+sb.capacity()+" Length "+sb.length());
        //capacity*2+2=>16*2+2=>32+2=34
        // System.out.println(""); 


        // String s="hello";
        // String s2=s;
        // s=s+" world";
        // System.out.println(s==s2);
        
        // System.out.println(s2);


        //String class 
        //object child
        //string =>literal style

        // int i=90;
        // //i variable= literal=90
        // String s1="hello".intern();
        // String s2="hello";
        // //string pool
        // String s3=new String("hello").intern();
        // String s4=new String("hello");
        // String s5=new String("hello5");
        // String s6 ="hello5";
        // String s7=new String("hello5");
        //outside =>pool check 
        //if object present poool then ok otherwise hello5=> make a copy for  pool
        //refrence of the other object=>outside the pool =>return  
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s4==s3);

        //s1 and s2 are pointing to same object
        //s3 and s4 are pointing to different objects
        //three object 
        

        //String pool
        //code =>"hello"=>hascode 

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        // System.out.println(s3.hashCode());
        // System.out.println(s4.hashCode());

    }
}
