public class Mcolor {

    static    boolean check(int graph[][], int colorVertex[], int vertex, int color){

        if(!(colorVertex[vertex]==0))
        return false;

        for(int i=0;i<graph[vertex].length;i++){
            if(graph[vertex][i]==1){
                if(colorVertex[i]==color)
                return false;
            }
        }
        return true;
    }
    public static boolean colorTheGraph(int graph[][],int colorVertex[], int colors,int vertex){

        if(vertex==colorVertex.length){
            return true;
        }
        for(int i=1;i<=colors;i++){
            if(check(graph, colorVertex,vertex,i)==true){
                colorVertex[vertex]=i;

               if( colorTheGraph(graph, colorVertex, colors, vertex+1)==true){
                    return true;
                }
                else{
                    colorVertex[vertex]=0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int graph[][]={{0,1,1,0,0,0},
            {1,0,1,1,1,0},
            {1,1,0,1,0,0},
            {0,1,1,0,1,0},
            {0,1,0,1,0,1},
            {0,0,0,0,1,0}};

            int colorVertex[]=new int[graph.length];

            int colors=2;

          if(  colorTheGraph(graph,colorVertex ,colors , 0)){
              for(int i=0;i<graph.length;i++){
                  System.out.println(i+" => "+colorVertex[i]);
              }
          }
          else{
              System.out.println("cannot be colored using "+colors+" colors");
          }
    }
}
