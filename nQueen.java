import org.graalvm.compiler.nodes.PiArrayNode.Placeholder;

public class nQueen {

    static boolean canPlace(int board[][], int row, int col){

        //col
        for(int i=0;i<=row;i++){
            if(board[i][col]==1){
                return false;
            }
        }

        //left dia
        for(int i=row,j=col;i>=0&& j>=0 ;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //right dia
        for(int i=row,j=col;i>=0&& j<=3;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }

    static boolean placeQueen(int board[][],int row){

        if(row==4){
            for(int i=0;i<4;i++){
                        for(int j=0;j<4;j++){
                            System.out.print(board[i][j]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
            return true;
        }
        for(int col=0;col<4;col++){
            if(canPlace(board, row, col)){
                board[row][col]=1;
                boolean flag=placeQueen(board, row+1);
                if(flag==false){
                    board[row][col]=0;
                }
                else{
                    board[row][col]=0;
                    //return flag;
                }
            }
        }

        return  false;
    }
    public static void main(String[] args) {
        int board[][]=new int[4][4];

        placeQueen(board,0);
        // if(placeQueen(board,0)){
        //     for(int i=0;i<4;i++){
        //         for(int j=0;j<4;j++){
        //             System.out.print(board[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }
    }
}























