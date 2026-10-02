class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int tempMax=0,tempMin=0;
        boolean allneg =true;
        for(int i=0;i<n;i++){
            total+=nums[i];
            if(nums[i]>=0){
                allneg=false;
            }
            tempMax+=nums[i];
            
            max=Math.max(max,tempMax);
            if(tempMax<0){
                tempMax=0;
            }
            

            tempMin+=nums[i];
            min=Math.min(min,tempMin);
            if(tempMin>0){
                tempMin=0;
            }
            
        }
        if(allneg){
            return max;
        }
        return Math.max(max,(total-min));

    }
}