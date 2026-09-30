class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n];
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(!map.containsKey(sum%k)){
                map.put(sum%k,i);
            }
            else{
                if((i-map.get(sum%k))>=2){
                    return true;
                }
            }
        }
        return false;
    }
}