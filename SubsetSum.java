package recursion.dynamicprogramming;

public class SubsetSum {

    static boolean subsetS(int arr[], boolean matrix[][]){
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=true;
        }
        for(int i=1;i<matrix[0].length;i++){
            matrix[0][i]=false;
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){

             if(j<arr[i-1]){
                    matrix[i][j]=matrix[i-1][j];
                }
                else if(j==arr[i-1]){
                    matrix[i][j]=true;
                }
                else if(j>arr[i-1]){

                    if(matrix[i-1][j]==true){
                        matrix[i][j]=true;
                    }
                    else{
                    int diff=j-arr[i-1];

                        if(matrix[i-1][diff]==true){
                            matrix[i][j]=true;
                        }
                        else{
                            matrix[i][j]=false;
                        }
                    }
                }
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
   public static void main(String[] args) {
       int sum=8;
       int arr[]={1,4,3,2};

       boolean matrix[][]=new boolean[arr.length+1][sum+1];

       System.out.println(subsetS(arr,matrix));

       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+"\t");
           }
           System.out.println();
       }
   } 
}
