import java.io.*;

class Candidate implements Serializable{
    String name;
    int age;
    String phone;

    Candidate(String name, int age, String phone){
            this.name=name;
            this.age=age;
            this.phone=phone;
    }
}

public class multipleobject {
    static void insertObject(Candidate obj) throws IOException{
        File file =new File("candidate_Details");
        
        FileOutputStream f=null;
        ObjectOutputStream oo=null;
        
            if(!file.exists()){
                file.createNewFile();
            }
            f=new FileOutputStream(file, true);
            oo=new ObjectOutputStream(f);
            try{
                oo.writeObject(obj);
            }
            finally{
                f.close();
                oo.close();
            }
        
    }
    static void readObject() throws IOException{
        File file =new File("candidate_Details");
        FileInputStream f=new FileInputStream(file);
        ObjectInputStream oi=new ObjectInputStream(f);
        try{

            Candidate c=(Candidate)oi.readObject();
            Candidate c2=(Candidate)oi.readObject();
            // Candidate c3=(Candidate)oi.readObject();
            // Candidate c4=(Candidate)oi.readObject();
           // while(c!=null){
                System.out.println("name : "+c.name+ "   age: "+c.age+"  phoen :"+c.phone);
                
              System.out.println("name : "+c2.name+ "   age: "+c2.age+"  phoen :"+c2.phone);
             //   c=(Candidate)oi.readObject();
            //}
        }catch(ClassNotFoundException c){
            System.out.println("Object cannot be casted ");
            c.printStackTrace();
        }
        catch(Exception e){
            System.err.println("there is some error");
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
      Candidate c=new Candidate("reena", 34, "2334234-23423");
      Candidate c2=new Candidate("reena2", 34, "2334234-23423");
      Candidate c3=new Candidate("reena3", 34, "2334234-23423");
      Candidate c4=new Candidate("reena4", 34, "2334234-23423");
      try{  
      insertObject(c);
      insertObject(c2);
      insertObject(c3);
      insertObject(c4);
      }
      catch(IOException e){
            System.out.println("Object cannot be written to the file");
            e.printStackTrace();
        }

      try{
        readObject(); 
      }
      catch(IOException e){
        System.out.println("Problem in communication channel");
        e.printStackTrace();
      }
      
  }  
}
