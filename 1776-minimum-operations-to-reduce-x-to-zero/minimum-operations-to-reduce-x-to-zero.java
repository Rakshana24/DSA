class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int sum=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        if(total<x){
            return -1;
        }
        for(int i=0;i<n;i++){
          sum+=nums[i];
          while(total-sum<x ){
            sum-=nums[left];
            left++;
          }
          if(total-sum==x){
            min=Math.min(min,n-(i-left+1));
          }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}