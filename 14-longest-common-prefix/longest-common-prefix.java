class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String s="";
        int m=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            m=Math.min(m,strs[i].length());
        }
        for(int i=0;i<m;i++){
            int k=1;
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                k=0;
                }
            }
            if(k==1){
                s+=strs[0].charAt(i);
            }
            else{
                break;
            }
        }
        return s;
    }
}