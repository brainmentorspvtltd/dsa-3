package array;

public class Task {

    public static void reverse(int arr[]){

        int i=0;
        int j=arr.length-1;

        for(;i<j;){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void printing(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void leftShiftBy1(int arr[]){

        //tech -1
        // int temp=arr[0];
        // //shifting by by
        // for(int i=1;i<=arr.length-1;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[arr.length-1]=temp;

        //tech -2

        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    static void leftShiftBlock(int arr[],int k){

        int block[]=new int[k];
        //block copy =>first kn elements
        for(int i=0;i<k;i++){
            block[i]=arr[i];
        }

        //arr elelments shift left
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        //arr k space last =>fill up -=>block elements
        for(int i=arr.length-k,j=0;i<arr.length;i++,j++){
            arr[i]=block[j];
        }
    }
    static void zigZag(int arr[]){

        int flag=0;
        for(int i=0;i<arr.length-1;i++){

            if(flag==0){
                if(arr[i]<arr[i+1]){

                }
                else{
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                flag=1;
            }
            else if(flag==1){
                if(!(arr[i]>arr[i+1])){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                flag=0;
            }
        }
    }
    static void leaderNaive(int arr[]){
        
        //9,8,7,6,5,4,3,2,1=>worst case =>result slow
        //1,2,3,4,5,6,7,8,9=> best case =>result fast
        boolean flag=true;
        for(int i=0;i<arr.length;i++){//which ele
            flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag =false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr[i]+"  ");
            }
        }
    }
    static void leaderapp2(int arr[]){

        int max=arr[arr.length-1];
        System.out.print(arr[arr.length-1]+" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
    static void findmissing_extraspace(int arr[]){
        
        int temp[]=new int[arr.length+2];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=1;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                System.out.println(i);
                break; 
            }
        }

    

    }
    static void findMissing_xor(int arr[]){

        //0^0=>0
        //1^1=>0
        //1^0=>1
        //0^1=1

        int sum1=0;
        for(int i=1;i<=arr.length+1;i++){
            sum1=sum1^i;
        }
int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2=sum2^arr[i];
        }

        System.out.println(sum1^sum2);
    }
    
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};
        // printing(arr);
        // reverse(arr);
        // printing(arr);

        //rotation
        //shifting 
        //left shifting by 1
        int arr[]={1,2,3,4,5,6,7,8,9,10,12,13};
        //output=>4,5,6,1,2,3  k=3        

       // printing(arr);
        // int k=3;
        // //O(n*n);
        // for(int i=0;i<k;i++)
        // {
        //     leftShiftBy1(arr);
        // }

        // leftShiftBlock(arr,3);
        // printing(arr);


        //rightshiftbyone()
        //rightblockshift()


        //zigZag()
        // int arr2[]={4,3,7,8,6,2,1};
        // //3,7,4,8,2,6,1
        // //(<,>,<,>,<,>)
        // printing(arr2);
        // zigZag(arr2);
        // printing(arr2);

        //leaders
        //int arr2[]={1,2,3,49,6,78,53,2};
        //78, 53 2
        //leaderNaive(arr2);
        //leaderapp2(arr2);
        // int a[]=new int[5];
        // Task b[]=new Task[4];


//missing number 
        int arr3[]={1,2,3,4,6,7,8};
        //first n natural number=>arr3.length+1
        //5 is missing => 8
        //{1,2,3,4,5,6,7,8}

        //finsMissing(arr3);//=>index =>all number sorted
        
        //sort =>arr=>index
        //findmissing() before calling sort
        
        int arr4[]={3,2,1,5,6,7,9,8};
        //O(n^2)//for()for n natural =>for()to find respective number in our array
        //findmissingNAive();
        
        //sum=>n natural  n(n+1)/2=>sum first n natural numbre
        //sum2=sum of array =>sum-sum2=>missing number 
        //findmissing_sum();


        findMissing_xor(arr4);
        findmissing_extraspace(arr4);

        // int []c=new int[6];
        // int arr[]={1,2,3,5,5,5};
        // int []arr2={1,2,2};
        // int[]   at={3,4,5};
        // int     []ed={3,4,5,4,67,5};

        //reverse array
        

    }
}
