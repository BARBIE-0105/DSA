class Solution {
    public String longestPrefix(String s) {
       int n=s.length();
       int[]lgs=new int[n];
       int i=0,j=1;
       while(j<n){
        if(s.charAt(i)==s.charAt(j)){
            lgs[j++]=++i;
        }
        else if(i>0){
            i=lgs[i-1];
        }
        else{
            j++;
        }
       } 
       return s.substring(0,lgs[n-1]);
    }
}