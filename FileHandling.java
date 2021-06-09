import java.io.*;
//lambda =>intrface=>single function

//@FunctionalInterface

// class MyFilter implements FilenameFilter{
//     @Override
//     public boolean accept(File dirName , String fileName) {
//         // TODO Auto-generated method stub
//         //System.out.println("dirname ::"+dirName +" filename:  "+fileName);
//         //return true;
//             // if(fileName.contains("t")){
//             //     return true;s
//             // }
//             // if(fileName.endsWith(".java"))
//             // return true;
//             File f=new File(dirName, fileName);
//             if(f.length()>2000){
//                 return true;
//             }
            
//             return false;
//     }
// }
public class FileHandling  {
    
    public static void main(String[] args) throws IOException{
       
        String path="C:\\Users\\ashis\\Documents\\group3dit";

        File f=new File(path);
    //    MyFilter filter =new MyFilter();
        String strarr[]=f.list((dirname, filename)->filename.endsWith(".java"));
        File farr2[]=f.listFiles((dir,file)->{
            File ff=new File(dir, file);
                        if(ff.length()>2000){
                            return true;
                        }
                        
                        return false;        
        });
        System.out.println("result inside array");
        for(File fff:farr2){
            System.out.println(fff.getName()+" length: "+fff.length());
        }
        // for(String str: strarr){
        //     System.out.println(str);
        // }
//        printdir(f);
        // String arr[]=f.list();//names
        // for(String  filename:arr){
        //     System.out.println("length of "+filename+" is"+filename.length());
        // }
        // File arr2[]=f.listFiles();//file objects=>reference
        // for(File file:arr2){
        //     System.out.println("length of "+file.getName()+" is"+file.length());
        // }

       


    //     if(!f.exists()){
    //         f.createNewFile();
    //     }

    //     System.out.println(f.getAbsolutePath());
    //     System.out.println(f.isFile());
    //     System.out.println(f.isDirectory());
    //     System.out.println(f.getName());
    //     File f2=new File("notes12");

    //     boolean result=f.renameTo(f2);
    //     System.out.println(result);
    //     System.out.println(f.getName());
    //     System.out.println(f.getAbsolutePath());
    //     System.out.println(f.exists());
    //    System.out.println(f2.exists());
        //String parentPath="C:\\Users\\ashis\\Documents\\group3dit";
    //    String dirpath="C:\\Users\\ashis\\Documents\\group3dit\\abcd2\\abc";
    //    File dir=new File(dirpath);
    //    if(dir.exists()){
    //         File f=new File(dir,"notes4");
    //         f.createNewFile();
    //    } 
    //    else{
    //        dir.mkdir();
    //        File f=new File(dir , "notes4");
    //        f.createNewFile();
    //    }
    //    String childName="notes3";
    //   //  File f=new File(parentPath,childName);

    //     if(f.exists()){
    //         System.out.println("YEs it exists....");
    //     }
    //     else{
    //         f.createNewFile();
    //         System.out.println("File created");

    //     }

    }

    static void printdir(File f){

        File farr[]=f.listFiles();
        for(File ref:farr){
            if(ref.isFile()){
                System.out.println("file :: "+ref.getName());
            }
            else{
                System.out.println("-----------------dir :: "+ref.getName());
                printdir(ref);
            }
        }
    }
}
// InputStream,OutputStream =>abstract
       //Reader Writer=>

//data inside file=>011
//text, multimedia=>doc , videos , images ,audio=>
//text, binary(byte)

//byte=>stream
//text=>Reader

//File =>normal operation =>rename, create delete ,list ,full path , 