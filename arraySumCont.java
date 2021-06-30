package recursion;

public class arraySumCont {
    static int[] getMaxSum(int arr[], int k){

        int left=0;
        int right=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int tempsum=sum;
        for(int j=k,i=0;j<arr.length;j++,i++){
            tempsum=tempsum+arr[j]-arr[i];

            if(tempsum>sum){
                left=i+1;
                right=j;
                sum=tempsum;
            }
        }
        return new int[]{left,right};
    }
    static int[] dynamicWindow(int arr[]){
        int maxSum=0;
        int left=0;
        int right=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                left=k;
                right=i;
            }
            else if(sum<0){
                sum=0;
                k=i+1;
            }
        }
        return new int[]{left,right};
    }
  public static void main(String[] args) {
    //todo=>same question with prefix table

    int arr[]={1,2,3,7,-3,-7,1,5,8,-1,-9,-99,100};

    int index[]=dynamicWindow(arr);
    System.out.println(index[0]+" "+index[1]);
//     int arr[]={1,2,3,7,-3,-7,1,5,8,-1,-9};
//       int k=3;


//       int index[]=getMaxSum(arr,k);
// System.out.println(index[0]+"  "+index[1]);
  }  
}
