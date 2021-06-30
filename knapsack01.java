public class knapsack01 {
    static int knapsack(int weights[], int profits[],int maxWeight){

        int arr[][]=new int[weights.length][maxWeight+1];

        for(int i=0;i<arr.length;i++){
            arr[i][0]=0;
        }
        for(int i=0;i< arr[0].length;i++){
            arr[0][i]=0;
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(weights[i]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    int diff=j-weights[i];
                    int value=arr[i-1][diff];
                    value+=profits[i];
                    if(value>arr[i-1][j]){
                        arr[i][j]=value;
                    }
                    else{
                        arr[i][j]=arr[i-1][j];
                    }
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        return arr[arr.length-1][arr[0].length-1];
    }
   public static void main(String[] args) {
       
    int weights[]={0,1,5,2,3,4};
    int profits[]={0,100,200,300,200,100};

    int maxWeight=7;

    int maxProfit=knapsack(weights,profits,maxWeight);

    System.out.println("max profit = "+maxProfit);
   } 
}
