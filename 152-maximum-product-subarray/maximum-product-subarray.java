class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int product=1;
        for(int i=0;i<n;i++){
            product=1;
        for(int j=i;j<n;j++){

            
            product*=nums[j];
            max=Math.max(max,product);
        }
        if(product<1){
            product=1;
        }
        }
        return max;
    }

}