class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if (n1 > n2) return false;
        int[] freq=new int[26];
        for(int i=0;i<n1;i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;

        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                count++;
            }
        }
        if(count==26){
            return true;
        }
        int left=0;
        for(int i=n1;i<n2;i++){
            int in=s2.charAt(i)-'a';
            if(freq[in]==0){
                count--;
            }
            freq[in]--;
            if(freq[in]==0){
                count++;
            }

            int out=s2.charAt(left)-'a';
            if(freq[out]==0){
                count--;
            }
            freq[out]++;
            if(freq[out]==0){
                count++;
            }
            left++;
            if(count==26){
                return true;
            }

        }
       
         return false;
    }
}