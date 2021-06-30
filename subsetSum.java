package recursion;

public class subsetSum {
    // static void subsetSumfun(String options,String ans,int index){

    //      String subset=ans;
    //     System.out.println(ans);
    //     for(int i=index+1;i<options.length();i++){
    //         subsetSumfun(options, subset+options.charAt(i),i);
    //     }
    // }

    static boolean getSum(int arr[], int sum ,int currentSum , int index){
        
        if(sum<currentSum){
            return false;
        }
        if(sum==currentSum){
            return true;
        }
        // if(index==arr.length)
        // return false;
        for(int i=index+1;i<arr.length;i++){
            if(getSum(arr, sum, currentSum+arr[i], i))
            return true;

        }
        return false;
    }
   static  boolean toggleBoolean(boolean flag){
        return !flag;
    }
    public static void main(String[] args) {
       
        System.out.println(toggleBoolean(false));
        // int arr[]={1,5,11,5};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // if(sum%2==0){
        //     if(getSum(arr, sum/2,0,-1))
        //     System.out.println("sum possible");
        //     else{
        //         System.out.println("sum not possible");
        //     }
        // }
        // else{
        // System.out.println("not possible");
        // }
        
        // subsetSumfun("abcd","",-1);
    }
}
