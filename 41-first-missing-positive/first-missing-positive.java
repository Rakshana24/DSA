class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int[] arr=new int[n+2];
        
        for(int i=0;i<n;i++){

            if(nums[i]>=0 && nums[i]<=n){
            arr[nums[i]]+=1;
            }
            
            
        }
        for(int i=1;i<arr.length;i++){
            System.out.println(i+" "+arr[i]);
            if(arr[i]==0){
                return i;
            }
        }
        return 0;
    }

}