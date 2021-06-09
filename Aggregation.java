import jdk.nashorn.internal.runtime.regexp.joni.Warnings;

//Car has a Engine
//Bus has a Engine
//Train has a Engine

class Engine {
    int a;
    int b;
    Engine(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Car{

    Engine e;
    Car(Engine engine){
        e=engine;
    }
}
class Bus{
    Engine e;
    Bus(Engine engine){
        e=engine;
    }
}
class Train{
    Engine e;
    Train(Engine engine){
        e=engine;
    }
}

public class Aggregation {
public static void main(String[] args) {
    Engine e=new Engine(1,2);
    Engine e2=new Engine(4,5);

    Train t=new Train(e);
    Bus b=new Bus(e);
    Bus b2=new Bus(e2);
    };
}    
}
