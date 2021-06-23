package recursion;

import java.util.ArrayList;

public class powerSet {
    static void getPowerSet(String str,String subset,int index){


        System.out.println(subset);

        for(int i=index+1;i<str.length();i++){
            
            getPowerSet(str, subset+str.charAt(i),i);
        }

    }
    static void getPowerSetList(String str,String subset,int index, ArrayList<String> list){


        //System.out.println(subset);
        list.add(subset);
        for(int i=index+1;i<str.length();i++){
            
            getPowerSet(str, subset+str.charAt(i),i);
        }

    }
    static ArrayList<String> getListPow(String str,String subset,int index){


        if(index==(str.length()-1)){
            ArrayList<String> l= new ArrayList<>();
            l.add(subset+str.charAt(str.length()-1));
            return l;
        }
        ArrayList<String> list=new ArrayList<String>();
        
        for(int i=index+1;i<str.length();i++){
            
           ArrayList<String> temp=  getListPow(str, subset+str.charAt(i),i);
           for(String strtemp:temp){
               list.add(strtemp);
           }
        }

        list.add(subset);
        return list;

    }
    public static void main(String[] args) {
        //ArrayList<String> list=new ArrayList<String>();
        // getPowerSet("abc","",-1);
        // getPowerSetList("abc","",-1,list);
        // for(String str:list){
        //     System.out.println(str);
        // }

        ArrayList<String> list= getListPow("abc","",-1);
        for(String str:list){
            System.out.println(str);
        }
    }
}
