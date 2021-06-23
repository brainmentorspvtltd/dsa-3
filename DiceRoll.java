package recursion;

import javax.management.relation.RoleInfo;

//6
//by rolling a dice
//count the number of ways in which 6 can be produced
public class DiceRoll {
    static int  rollingDice(int faces,int currentSum,int sum){

        if(currentSum==sum){
            return 1;
        }
        else if(currentSum>6){
            return 0;
        }

int cnt=0;

        for(int i=1;i<=faces;i++){
            cnt+=rollingDice(faces,currentSum+i,sum);
        }
        // cnt+=rollingDice(currentSum+1);
        // cnt+=rollingDice(currentSum+2);
        // cnt+=rollingDice(currentSum+3);
        // cnt+=rollingDice(currentSum+4);
        // cnt+=rollingDice(currentSum+5);
        // cnt+=rollingDice(currentSum+6);
        return cnt;
    }
    public static void main(String[] args) {
        int faces=8;
        int sum=6;
        int ways=rollingDice(faces,0,sum);
        System.out.println(ways);
    }
}
