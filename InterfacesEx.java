
interface SoftwarePart1{

    //datta member =>final public 
    String softwarename="abc product";

    //function =>abstract public
    void showProduct();
    void countProducts();
    int login(String a , String b);
    int register(String a);
    void calender();
    void cart();
}
interface SoftwarePart2{
    void calculateRevenue();
    void calculateCustomers();
    boolean isProfit();
    void cart();
}

abstract class Programmer1 implements SoftwarePart1,SoftwarePart2{

    public void calculateRevenue(){
        
    }
    public void cart(){

    }
}

abstract class Programmer3 extends Programmer1{
    public void showProduct(){}
    public void countProducts(){}
    public int login(String a , String b){return 8;}
    public int register(String a){return 9;}
    public void calender(){}
    public void cart(){}
}
class Programmer4 extends Programmer3{
    public void calculateRevenue(){}
    public void calculateCustomers(){}
    public boolean isProfit(){return false;}    
}
// class Programmer2 implements SoftwarePart2{

// }
public class InterfacesEx {
    
}
