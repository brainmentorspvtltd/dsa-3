public class KnightTour {
    
    static boolean generateKnightTour(int board[][],int xoption[], int yoption[],int x,int y,int num){

        if(num==65){
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(board[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println();
            return true;
        }
        if(x<0 || y<0 ||x>7 || y>7 ||board[x][y]!=0){
            return false;
        }
        else{
            for(int i=0;i<8;i++){
                board[x][y]=num;

                if(generateKnightTour(board, xoption, yoption, x+xoption[i], y+yoption[i], num+1)==true){
                    //board[x][y]=0;
                    return true;
                }
                else{
                    board[x][y]=0;
                }
            }

            return false;
        }

    }

    public static void main(String[] args) {
        
        int board[][]=new int[8][8];
        int xoption[]={2,1,-1,-2,-2,-1,1,2};

        int yoption[]={1,2,2,1,-1,-2,-2,-1};
        // int xoption[]={-1,-2,2,1,1, 2, -2,-1};
        // int yoption[]={2,  1,1,2,-2,-1,-1,-2};
        boolean flag=generateKnightTour(board,xoption,yoption,0,0,1);
        
        // if(flag==true){
        //     for(int i=0;i<8;i++){
        //         for(int j=0;j<8;j++){
        //             System.out.print(board[i][j]+"\t");
        //         }
        //         System.out.println();
        //     }
        // }
    }
}
