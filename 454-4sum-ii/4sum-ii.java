class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int key=nums1[i]+nums2[j];
                map1.put(key,map1.getOrDefault(key,0)+1);
            }
        }
        int y=0;
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int key=nums3[i]+nums4[j];
                map2.put(key,map2.getOrDefault(key,0)+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
            if(map2.containsKey(-1*entry.getKey())){
                ans+=entry.getValue()*map2.get(-1*entry.getKey());
            }
        }
        return ans;

        
    }
}