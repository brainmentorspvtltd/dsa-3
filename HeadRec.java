public class HeadRec {
//1,2,3,4,5,6....n
//n.....4,3,2,1

static void  printNumbers(int n){

    if(n==1){
        System.out.println(n);
        return ;
    }

    printNumbers(n-1);
    System.out.println(n);

}


public static void main(String[] args) {
    printNumbers(5);
}    

}










/*Q1:in the given string replace each pi with 3.14 
string s="pi2323434pipi4234324p"

output=>3.142323433.143.144234324p


Q2:mention the count a particular repeated char in contiguous location 
in the following way  
String s="xxxxxxxxxxxxxxyyyyxyyx"

output:"x14y4x1y2x1"

Q3:permutation of string abc rep not allowed
3 length string
output=>["abc","acb",bac,bca,cab,cba]

Q4: powerset of "abc"
["","a","b","c","ab","ac","bc","abc"]


Q5:coins of denomination 1 2 3 in infinite amount are there you have to print the ways in which sum 10 can be made



{​​2,2 ,2 ,2,2}​​

{​​2,3,2,3}​​

{​​3,3,2,2}​​



result will be total number of ways.
*/