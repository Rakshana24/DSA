class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq=new int[26];
        int left=0;
        int right=0;
        int maxLen=0;
        for(right=0;right<n;right++){
            freq[s.charAt(right)-'A']++;
            while(right-left+1-maxfreq(freq)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    private int maxfreq(int[] freq){
        int max=0;
        for(int num:freq){
            max=Math.max(max,num);
        }
        return max;
    }
}