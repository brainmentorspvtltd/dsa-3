

class rescursion{

    static void print(int i){
        if(i==5){
                    return ;
                }

        System.out.println("hello");
        print(i++);
    }

//1*2+2*3+3*4+4*5....n*(n+1)// (n=3  result=20)
//f(n)=(n)*(n+1)+f(n-1)
//f(3)=3*4+f(2)

static int patt(int n ){
    if(n==1)
    return 2;
    return n*(n+1)+patt(n-1);
}

//1+2+3+4+5...n
// f(n)=n+f(n-1)

static int add(int n){
    if(n==1){
        return 1;
    }
   return  n+add(n-1);
}


// f(4)=10=4+f(3)
// f(3)=3+f(2)
// f(2)=2+f(1)
// f(1)=1

//1*2*3*4*5....*n
//f(n)=n*f(n-1)
//
//2 2 6 4 10 6 14 8 ...
//1 2 3 4 5  6   7 8 
//f(n)={ f(n-1) , if(n%2=0){ print(n)
//         else print(n*2)} 

static void patt2(int n){

    if(n==1){
        System.out.println(2);
        return ;
    }
    patt2(n-1);
    if(n%2==0){
        System.out.println(n);
    }
    else{
        System.out.println(n*2);
    }

}

//String s ="sertyuihjklm,k"
//vowels count
/*f(s,i)={ if(s[i]==vowel){
                f(s,i+1)+1
} 
         else {
                f(s,i+1)+0
} }
f(s,0)=v=>f(s,1)+1
       nv=>f(s,1)+0

f(s,1)=v=>f(s,2)+1
    =nv=>f(s,2)+0

    ....

f(s,last+1)=>if(s.length()==i)
return 0;
*/
// static int countVowels(String s, int in){

//     if(in==s.length()){
//         return 0;
//     }

//     if(s.charAt(in)=='a'||s.charAt(in)=='e'||s.charAt(in)=='i'||s.charAt(in)=='o'||s.charAt(in)=='u')
//     {
//        return  countVowels(s, in+1)+1;
//     }
//     else{
//         return countVowels(s, in+1)+0;
//     }
// }

static int countVowels(String s){
    if(s.length()==0)
    return 0;
int count=0;
    if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')
    {
      count= 1;
    }
    else{
        count=0;
    }
    return  count+countVowels(s.substring(1));
}
// f(4) f(5----)+
// f(5)  f(6)

//0,1,1,2,3,5,8,13..............
//f(n)=f(n-1)+f(n-2)

static int fibo(int n){
    if(n==0 ||n==1){
        return n;
    }

    return fibo(n-1)+fibo(n-2);

}

static void permutation(String choice, String ans){

    if(ans.length()==3){
        System.out.println(ans);
        return;
    }
    for(int i=0;i<choice.length();i++){
        String nchoice=choice.substring(0, i)+choice.substring(i+1);
        permutation(nchoice,ans+choice.charAt(i));
    }
    // permutation(choice,ans+choice.charAt(1));
    // permutation(choice,ans+choice.charAt(2));
}

    public static void main(String[] args) {

        permutation("abchyhghjgjud","");
//System.out.println(fibo(7));
        //add(5);
       // patt2(5);
        //String s=scanner;
        // System.out.println(countVowels("swdfdsgfsdgfd",0));
       // System.out.println(countVowels("gidfjghvjadlkgksjkfsm,,dnf"));
        //System.out.println(patt(3));
        //print(0);
        // int i=0;
        // while(true){
        //     if(i==5){
        //         break;
        //     }
        //       i++;  
        //     System.out.println("hello");
        // }
    }
}