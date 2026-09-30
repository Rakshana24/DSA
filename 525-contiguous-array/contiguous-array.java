class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,-1);
        int max=0;
        for(int i=0;i<n;i++){
           if(nums[i]==0){
            sum-=1;
           }
           else{
            sum+=1;
           }
            if(!map.containsKey(sum)){
             map.put(sum,i);
            }
            else{
              int len=i-map.get(sum);
              max=Math.max(max,len);
            }
        
        }
        return max;
        
    }
}