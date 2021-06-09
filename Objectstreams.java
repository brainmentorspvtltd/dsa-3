import java.io.*;
//is-a

class Mars implements Serializable {
    int rad;
    Mars(){
        rad=9000;
    }
}

//is a 
class Galaxy{
//mars
    String s;
    String galaxyName="Milky way";
    Galaxy(){
        s=new String("mars");
       // mars=new Mars();
    }
}
class Earth extends Galaxy  implements Serializable {
    private final static long serialVersionUID=1L;
    //int a=100;
    Mars mars;
    int radius;
    boolean water;
    transient int extra;
    Earth(){
        mars=new Mars();
        radius =10000;
        water=true;
        extra=3000;
    }
}

public class Objectstreams {
    public static void main(String[] args) throws IOException, ClassNotFoundException  {
        
        // Earth e=new Earth();
         File f=new File("earthInfo");
        // if(!f.exists()){
        //     f.createNewFile();
        // }
        // FileOutputStream fo=new FileOutputStream(f); 
        // ObjectOutputStream oo=new ObjectOutputStream(fo);
        // oo.writeObject(e);

        FileInputStream fi =new FileInputStream(f);
        ObjectInputStream oi=new ObjectInputStream(fi);
        Earth e2=(Earth)oi.readObject();

        System.out.println(e2.radius+"  "+e2.water+" "+e2.extra+" "+e2.galaxyName+" "+e2.s+" "+e2.mars.rad);

        oi.close();
        fi.close();
       //oo.close();
       //fo.close();
    }
}
