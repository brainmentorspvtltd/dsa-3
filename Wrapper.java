public class Wrapper {
   public static void main(String[] args) {
       Integer i=89;
       Double d=90.0;
       Character c='a';
       System.out.println(i.hashCode());
       int a=10;
       System.out.println(d.MAX_VALUE);
       System.out.println(i.MIN_VALUE);


       Integer i2=new Integer(a);
       
      // System.out.println(i2.intValue());
       //autoboxing
        Integer i3=a;

       //unboxing
        int a2=i3;
        System.out.println(a2);
   } 
}
