import java.io.File;
//constructors=>space allocate,initialize(not these things)
//after initialization =>construct
//memory sapce free(garbage collector)


class FileXYZ{
    File file;

    FileXYZ(String file){
        this.file=new File(file);
    }
    void read(){
        //this function pritn on console
    }
    void write(String data ){
        //file write
    }
    int  countCharacter(){
        int count=90;
        return count;
    }
//before collecting any object=>object will run this function
   public void finalize(){
    //clean up 
    this.file.delete();
    }

}
public class FinalizeMethod {
  public static void main(String[] args) {
      //file are valid
      FileXYZ f=new FileXYZ("xyz.abc");
      f.read();
      f.write("sdfghjkl;fghj");
      f=null;
      //object is still there without any reference to it
      //finalize()=>garbage coll
      FileXYZ f2=new FileXYZ("abc");
      FileXYZ f3=new FileXYZ("bcd");
      FileXYZ f4=new FileXYZ("ghf");
  }  
}
