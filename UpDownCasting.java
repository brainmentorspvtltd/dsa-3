//objects
class Shape{
    int area;

    void calculateArea(){

    }
}
class Circle extends Shape{

    int radius;
Circle(){

}
    Circle(int radius){
        this.radius=radius;
    }

    void calculateArea(){
        System.out.println("the area is "+(this.radius*this.radius*3.14));
    }
} 
class Square extends Shape{

    int length;

    Square(int length){
        this.length=length;
    }

    void calculateArea(){
        System.out.println("the area is "+(this.length*this.length));
    }
} 
class Semicircle extends Circle{
}
public class UpDownCasting {
    public static void main(String[] args) {


        //object is parent to strign 
        // String s=new String("abcd");
        // Object obj=s;

        //type mismatch=>assignment
        //shape =>circle and square
        //square circle they =>shape 
        // String s= new String("abcd");
        // StringBuffer sb=s;
        //some relation between (StringBuffer)   s;
        //Object s=new String();
        
        Shape s=new Semicircle();
        Circle c=(Circle)s;
        
        // Object obj=new String("aaa");
        // Object obj=new Object();
        // String s=(String)obj;
        //(String )=>child 

        //runtime
        // Object s=new String();
        // StringBuffer sb=(StringBuffer)s;

        //     Shape s=new Square(12);
        //     Circle c=(Circle)s;
        //  String s= new String("abcd");
        //  StringBuffer sb=(StringBuffer)s;
        // Square sq=new Square(12);
        // Circle c=(Circle)sq;




        // Shape s=new Circle(5);

        // //reference =>shape=>point to properties and functions that are there in shape class
        // //
        // s.calculateArea();
        // System.out.println(s.radius);

    }
}
