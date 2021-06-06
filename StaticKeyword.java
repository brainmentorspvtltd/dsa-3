 //static=> objects are not needed to access
//class name through acces
//static => objects and classname accessible
//public ,final ,default, 
//private protected static 
class Employee{

    //sharable=>Common
    static String companyName="Myntra";
    final static String founder="abc" ;
    static int fund=1000;
    static int revenue=90000;
    //distinct
    private int salary=10;
    String designation;

//return type v+function =>together
//all other keywords can be placed in any order
    final public static void getInfo(){

    }
//satic function =>sattic data member and function=>yes it is possibel
    static void getRevenueInfo(){
       // System.out.println(this.designation);
       //non static data members or function cannot be called from a static scope 
       System.out.println(Employee.revenue);
    }
//not static =>not static accessible
    int  getSalary(){
        //non static scopes =>they can access sattic data member , function
        if(fund>this.salary){
            Employee.fund-=this.salary;
        }
        return this.salary;
    }

}
//everyrging is inheriited=>static =>static 

class Department extends Employee{

    static void getRevenueInfo(){
        Employee.fund=8000;
    }

}

//StaticKeyword.main()
public class StaticKeyword {
    public void run(){

    }
  public static void main(String[] args) {
      //run();
      Department.getRevenueInfo();
    Employee e=new Employee();
    Employee e2 =new Employee();
    Employee e3=new Employee();
    e.getSalary();
    e2.getSalary();
    e3.getSalary();
    e.getSalary();
    e.getSalary();
    System.out.println("total ramining fund"+Employee.fund);
    System.out.println("total ramining fund"+e.fund);   
    System.out.println("total ramining fund"+e2.fund);    
  }  
}
