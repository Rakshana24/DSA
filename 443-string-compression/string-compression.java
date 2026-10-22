class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        String s="";
        s+=chars[0];
        int c=1;
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
           if(chars[i-1]==chars[i]){
            c++;
           }
           else if(c!=1){
            s+=c;
            c=1;
            s+=chars[i];
           }
           else if(c==1){
            s+=chars[i];
           }
        }
        if(c>1){
            s+=c;
        }
        char[] ne=s.toCharArray();
        for(int i=0;i<s.length();i++){
          chars[i]=s.charAt(i);
        }
        return s.length();
    }
}