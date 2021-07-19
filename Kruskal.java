import javax.sql.XAConnection;

public class Kruskal {
public static int find(int index,int connection[]){

    while(connection[index]!=index){
        index=connection[index];
    }

    return index;
}
public static void union(int x , int y, int connection[]){
    int fx=find(x,connection);
    int fy=find(y,connection);

connection[fx]=fy;


}
    public static void main(String[] args) {
    int graph[][]={{0,2,0,3,3},
    {2,0,2,1,0},
    {0,2,0,2,3},
    {3,1,2,0,1},
    {3,0,3,1,0}};

    int connection[]=new int[graph.length];
    for(int i=0;i<connection.length;i++){
        connection[i]=i;
    }

    for(int edges=0;edges<graph.length-1;edges++){

        int min=Integer.MAX_VALUE;
        int x=0,y=0;
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                if(graph[i][j]!=0 && min>graph[i][j] && find(i,connection)!=find(j,connection)){
                    min=graph[i][j];
                    x=i;
                    y=j;
                }
            }
        }

        union(x,y,connection);

        System.out.println(x+ " ==> "+ y);
    }
 }   
}
