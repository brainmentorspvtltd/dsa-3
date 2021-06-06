
class Threadcreator extends Thread{
    public void run(){
        String s;
        for(;true;){
            s=new String("hello iam i astrign object");
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        Threadcreator t1=new Threadcreator();
        Threadcreator t2=new Threadcreator();
        Threadcreator t3=new Threadcreator();
        Threadcreator t4=new Threadcreator();
        Threadcreator t5=new Threadcreator();
        Threadcreator t6=new Threadcreator();
        Threadcreator t7=new Threadcreator();

        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
