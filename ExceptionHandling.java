import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

//problem =>runtime

class ExceptionHandling{

    static void processingServer(int fisrtInput ,int secondInput)throws Exception{

        System.out.println("SERVER: Iam runnng");
        System.out.println("SERVER: It is a db request");
        System.out.println("SERVER: Connection with db established");
        try{
            System.out.println("SERVER: processing");

            int processing=fisrtInput/secondInput;
            System.out.println("SERVER: result is ready");
            System.out.println("SERVER: Send result successfully");
        }
        // catch(Exception e){
        //     System.out.println("SERVER: problem in processing ");
        // }
        finally{
            System.out.println("SERVER: closing database connections");
        }
        
        

    }
    static void gui(){
        System.out.println("GUI: I am on the webpage ");
        System.out.println("GUI: please process my request");
        int fisrtInput=89;
        int secondInput=10;
        try{
        processingServer(fisrtInput,secondInput);
        System.out.println("GUI: I have got results");
        System.out.println("GUI: thanku ");
        }
        catch(Exception e){
            System.out.println("GUI : processing problem ");
        }
    }
    public static void main(String[] args) {
        System.out.println("MAIN SERVER: A web Page has been requested");

        gui();
        System.out.println("MAIN SERVER: Ok ...BYe");

    }
}