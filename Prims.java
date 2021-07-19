public class Prim {
   public static void main(String[] args) {
       int graph[][]={{0,2,0,3,3},
       {2,0,2,1,0},
       {0,2,0,2,3},
       {3,1,2,0,1},
       {3,0,3,1,0}};


       int connection[]=new int[graph.length];
       boolean visited[]=new boolean[graph.length];
       int cost[]=new int[graph.length];

       for(int i=0;i<cost.length;i++){
           cost[i]=Integer.MAX_VALUE;
       }

       connection[0]=-1;
       cost[0]=0;

       for(int i=0;i<graph.length-1;i++){
            int index=getmini(cost,visited);
            visited[index]=true;


            for(int j=0;j<visited.length;j++){
                if(cost[j]>graph[index][j] && graph[index][j]!=0 && visited[j]==false){
                    cost[j]=graph[index][j];
                    connection[j]=index;
                }
            }
       }

       printPath(connection,cost);


   } 
   static void printPath(int connection[],int cost[]){
       for(int i=0;i<connection.length;i++){
        if(connection[i]!=-1)   
        System.out.println(i+"==>"+connection[i]+"  =  "+cost[i]);
       }
   }
   static int getmini(int cost[] ,boolean visited[]){
    int minCostIndex=Integer.MAX_VALUE;
    int mincost=Integer.MAX_VALUE;   
    for(int i=0;i<cost.length;i++){
            if(cost[i]<mincost && visited[i]==false){
                minCostIndex=i;
                mincost=cost[i];
            }
       }

       return minCostIndex;
   }
}
