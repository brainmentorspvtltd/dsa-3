//cpp =>const final 
//final =>definition ,assignment =>one time
//school

//fianl class=>inherit 
final class Student{
    
    final String name;
    //final String name="tina";
    int height;
    int weight;
    int rollNo;
    int section;
    int standard;

//constructors also run for one time
    Student(String name){
        this.name=name;
    }
    Student(){
        this.name="priya";
    }

    void printInfo(){
       // this.name="priya";
    }

  final void read(){
      System.out.println("iam a read function");
  }

}
//if the class is not final 
//then all the properties and function can be inherited and some of them are final 
//then you wont be able to change their definition or value



// class StandardOne extends Student{

//     void printInfo(){

//     }

//     //this method cannot be overriden
//     //because =>final function
//     // void read(){

//     // }

// }
public class FinalKey {
    public static void main(String[] args) {
        
    }  
}
