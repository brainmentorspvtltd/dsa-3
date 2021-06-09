import java.io.*;
public class InputoutputStreams {
    public static void main(String[] args) throws IOException {
        

        File f=new File("notes");
        //f.createNewFile();
        FileInputStream fi=new FileInputStream(f);
        BufferedInputStream bi=new BufferedInputStream(fi);
 //char =>positive
        final int  EOF=-1;
        int number=bi.read();
        while(number!=EOF){
            System.out.print((char )number);
            number=bi.read();
        }

 FileOutputStream fo=new FileOutputStream(f,true);
 BufferedOutputStream bo=new BufferedOutputStream(fo);
        String s="this is a new String ";
        byte b[]=s.getBytes();
        bo.write(b);
        bo.write('a');
        bo.write('\n');
        bo.write(b,3,8);



        // //char =>positive
        // final int  EOF=-1;
        // int number=fi.read();
        // while(number!=EOF){
        //     System.out.print((char )number);
        //     number=fi.read();
        // }


       
        
        // FileOutputStream fo=new FileOutputStream(f,true);
        // String s="this is a new String ";
        // byte b[]=s.getBytes();
        // fo.write(b);
        // fo.write('a');
        // fo.write('\n');
        // fo.write(b,3,8);

           bo.close();
            fo.close();
            fi.close();
            bi.close();

    }
}
