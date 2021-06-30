package recursion.dynamicprogramming;

public class BinoCoeff {

    static int binocoefficient(int arr[][],int n,int r){

        if(n==r){
            arr[n][r]=1;
            return arr[n][r];
        }
        if(r==1){
            arr[n][r]=n;
            return n;
        }
        if(arr[n][r]!=0){
            return arr[n][r];
        }
        arr[n][r]= binocoefficient(arr, n-1, r-1)+binocoefficient(arr, n-1, r);
        return arr[n][r];
    }
    public static void main(String[] args) {
        int n=6;
        int r=4;
        int arr[][]=new int[n+1][r+1];

        System.out.println(binocoefficient(arr,n,r) );
        for(int i=0;i<=n;i++){
            for(int j=0;j<=r;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
