import java.math.BigDecimal;
import java.math.BigInteger;
class BigDecimalNumber{
    public static void main(String[] args) {
        BigInteger bi=new BigInteger("21345678");
        BigInteger bi2=new BigInteger("21345678");

        long number=bi.longValue();
        int numberInt=bi.intValue();
        float numberFloat=bi.floatValue();
        int resCompare=bi.compareTo(bi2);
        if(resCompare==-1){
            System.out.println(bi+" is smaller than "+bi2);
        }
        else if(resCompare==0){
            System.out.println(bi+" is equal to "+bi2);
        }
        else{
            System.out.println(bi+" is greater than "+bi2);
        }
        //0 equal ,-1 bi<bi2, +1 bi>bi2 

        BigInteger result=bi.subtract(bi2);
    
        System.out.println(result);
        System.out.println(bi);
        // double d=0.9;
        // double d2=d-0.8;
        // System.out.print(d);
        // System.out.print(d2);
        // BigDecimal bd=new BigDecimal("1232454.432434233");
        // BigDecimal bd2=new BigDecimal("1232454.432434233");
        // BigDecimal bd3=bd.add(bd2);
        // System.out.println(bd3);
        
        // double d=bd.doubleValue();
        // System.out.println(d);
    }
}