package classesExample;

class Human{
    //all attributes should  be private
    String name;
//    String Lastname;
    int age;
    int weight=5;
    int id;
    int height=30;
    String address;
    String phoneNumber;

    void setAge(int a){
        if(a<0 ||a>100){
            this.age=this.age;
        }
        else{
            this.age=a;
        }
    }
    void setWeight(int w){
        if(weight<1|| weight >150){
            this.weight=this.weight;
        }
        else{
            this.weight=w;
        }
    }

    int getAge(){
        return this.age;
    }

    public void updateState(String n,int a,int h,int w,String pn,String add,int id){
        this.name=n;
        this.age=a;
        this.height=h;
        this.weight=w;
        this.phoneNumber=pn;
        this.address=add;
        this.id=id;
    }
    public void printInfo(){
        System.out.println("name is: "+this.name);
        System.out.println("age is: "+this.age);
        System.out.println("height is: "+this.height);
        System.out.println("weight is: "+this.weight);
        System.out.println("====================================");
    }
    //default
    Human(){//by deafult but as soon as any other is defined than you have it as well for usage.
        System.out.println("iam a default Constructor");
    }
    Human(int age){
        this();
        this.age=age;
    }
    Human(int age ,int height){
        this.age=age;
        this.height=height;
    } 
    Human(String n,int a,int h,int w,String pn,String add,int id){
        this.name=n;
        this.age=a;
        this.height=h;
        this.weight=w;
        this.phoneNumber=pn;
        this.address=add;
        this.id=id;
    }
}
public class Test {
    public static void main(String[] args) {
        //object life cycle =>constructor one time 
        //constructor =>doesnot return anything
        Human ram=new Human(23);
        Human sham =new Human();

        
        // ram.updateState("ram", 34, 178, 78, "4567890", "t block", 789);
        // sham.updateState("sham", 67, 175, 80, "4898999", "g block", 756);
        // sham.printInfo();
        // ram.printInfo();
        // ram.name="ram";
        // ram.age=-34;
        // ram.height=168;
        // ram.weight=70;
        // ram.phoneNumber="3456789";
        // ram.address="f block";
        // ram.id=12344;

        // sham.name="sham";
        // sham.age=90;
        // sham.height=180;
        // sham.weight=80;
        // sham.phoneNumber="1234567";
        // sham.address="g block";
        // sham.id=9087;

//         System.out.println("name is: "+ram.name);
//         System.out.println("age is: "+ram.age);
//         System.out.println("height is: "+ram.height);
//         System.out.println("weight is: "+ram.weight);
// System.out.println("====================================");
        // System.out.println("name is: "+sham.name);
        // System.out.println("age is: "+sham.age);
        // System.out.println("height is: "+sham.height);
        // System.out.println("weight is: "+sham.weight);

    }
}
