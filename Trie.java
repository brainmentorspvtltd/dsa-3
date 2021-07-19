import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

class TrieNode{
    boolean isEnd;
    TrieNode arr[]=new TrieNode[26];

    TrieNode(){
        isEnd=false;
        for(int i=0;i<26;i++){
            arr[i]=null;
        }
    }
}

public class Trie {
    static void insert(TrieNode root, String s){
       //System.out.println(root);
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(root.arr[index]==null){
                root.arr[index]=new TrieNode();
            }
            root=root.arr[index];
        }

        root.isEnd=true;

    }

    static boolean search(TrieNode root, String s){

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(root.arr[index]==null){
                return false;
            }
            root=root.arr[index];
        }
       if( root.isEnd==true)return true;
        else return false;

    }
    static ArrayList<String> wordWithprefix(TrieNode root, String pre){
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<pre.length();i++){
            int index=pre.charAt(i)-'a';
            if(root.arr[index]==null){
                return list;
            }
            root=root.arr[index];
        }
        //findwords(list,root,i,pre+(char)(97+i));
        if(root.isEnd==true){
            list.add(pre);

        }
        for(int i=0;i<26;i++){
            if(root.arr[i]!=null){
                findwords(list,root.arr[i],i,pre+(char)(97+i));
               // pre=pre.substring(0,pre.length()-1);
            }
        }
        return list;
    }
    static void findwords(ArrayList<String> list, TrieNode root, int index,String pre){
        if(root==null){
            return;
        }
        if(root.isEnd==true){
            //String ans=pre+(char)(97+index);
            list.add(pre);
                //return;
        }
        for(int i=0;i<26;i++){
            if(root.arr[i]!=null){
                findwords(list,root.arr[i],i,pre+(char)(97+i));
            }
        }
    }
    public static void main(String[] args) {
        TrieNode root=new TrieNode();
        insert(root,"cat");
        insert(root,"car");
        insert(root, "castle");
        insert(root,"cart");
        insert(root,"dog");
        insert(root,"dish");
        insert(root,"dim");

       ArrayList<String> list= wordWithprefix(root,"car");
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }

        // System.out.println(search(root,"cast"));
        //  insert(root,"cast");
        // System.out.println(search(root,"cast"));

    }
}
