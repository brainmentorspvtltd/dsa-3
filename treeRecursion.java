public class treeRecursion {
    static int n=1;
    static void printNum(int level ,int currlevel){
        if(level==currlevel){
            return ;
        }
        int nodeNumber=n;
        n++;

        //System.out.print(nodeNumber+" ");
        printNum(level, currlevel+1);
        System.out.print(nodeNumber+" ");
        printNum(level, currlevel+1);
    }

static int stairJump(int max, int currentStep, int maxJump){

    if(currentStep==5)
    return 1;
    if(currentStep>max){
        return 0;
    }
    int jump=0;
    for(int i=1;i<=maxJump;i++){
        jump+=stairJump(max, currentStep+i, maxJump);
    }
    // jump+=stairJump(max, currentStep+1, maxJump);
    // jump+=stairJump(max, currentStep+2, maxJump);
    // jump+=stairJump(max, currentStep+3, maxJump);
    return jump;

}

    public static void main(String[] args) {
        System.out.println(stairJump(5,0,3));
        //printNum(3,0);
    }
}
