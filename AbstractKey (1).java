// //Databases-=>data 
// //data base connect =>vendor library 
// //write, query, upadte,connectUrl;
// // 


// abstract class Database{
//     String connectURl;;
//     abstract void connect();
//     void write(){

//     }
//     void query(){

//     }
//    void  readd(){

//     }
// }

// //buttons,sockets

// //socket

// //this class wont be able to have any object
// abstract class Socket{

//     void electricityflow(){

//     }
//     void connect(){

//     }

//     //info provided 
//     abstract void firstHole();
//     abstract void secondHole();
//     abstract void thirdHole();

// }
// class ExtendedS extends Socket{

//     void firstHole(){

//     }
//     void secondHole(){

//     }
//     void thirdHole(){

//     }
// }

abstract class Animal{
    int teeth;
    int eyes;
    abstract void eat();
}
//no object
abstract class Human extends Animal{
    abstract void eat();
}
//no object
class Person extends Human{
    void eat(){

    }
}
//object 
public class AbstractKey {
    public static void main(String[] args) {
        // Socket s=new socket();
        // s.firstHole();       
        // ExtendedS s=new ExtendedS();
        // s.firstHole(); 
    }
}
