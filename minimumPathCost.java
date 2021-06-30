public class minimumPathCost {

    static void minimumDistance(int graph[][]){

        for(int k=0;k<graph.length;k++){

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){

                int previousValue=graph[i][j];

                int newValue= graph[i][k]+graph[k][j];
                if(previousValue>newValue){
                    graph[i][j]=newValue;
                }
                else{
                    graph[i][j]=previousValue;
                }
            }
        }
    }
    }
   public static void main(String[] args) {
       int graph[][]={{0,4,2,1000},{5,0,3,6},
       {1,1000,0,2},{1000,1,1000,0}};

       minimumDistance(graph);

       for(int i=0;i<graph.length;i++){
           for(int j=0;j<graph.length;j++){
               System.out.print(graph[i][j]+" ");
           }
           System.out.println();
       }
   } 
}
