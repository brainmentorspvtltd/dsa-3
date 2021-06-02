public class CommandLineArg {
    public static void main(String[] arr) {

        //n number s
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i]);
            sum=sum+num;
        }
        System.out.println(sum);


        // int a[]=new int[0];
        // System.out.println(a);
        // arr=null;
        // System.out.println(arr);

    //     int firstNumber=Integer.parseInt(arr[0]);
    //     int secondNumber=Integer.parseInt(arr[1]);
    //    // System.out.println(firstNumber+secondNumber);
    //     System.out.println(arr[0]+arr[1]);

        // for(int i=0;i<args.length;i++){
        //     System.out.println(args[i]);
        // }
        String s="hello";
        // String s1=new String("hello world");
        // System.out.println(s1);

    }
}
