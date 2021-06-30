package recursion;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> resultList=new ArrayList<List<String>>();
        ArrayList<String> tempList=new ArrayList<String>();
        
        getPartition(resultList,tempList,0,s);
        return resultList;

    }
    
    void getPartition( List<List<String>> resultList,ArrayList<String> tempList,int startIndex,String str){
        
        if(startIndex>=str.length()){
            resultList.add(new ArrayList<String>(tempList));
        }
        for(int end=startIndex;end<str.length();end++){
            
            if(isPalindrome(str.substring(startIndex,end+1))){
                tempList.add(str.substring(startIndex,end+1));
                
                getPartition(resultList,tempList,end+1,str);
                tempList.remove(tempList.size()-1);
                
            }
        }
        
    }
    
    boolean isPalindrome(String str){
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    
}
