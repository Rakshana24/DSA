class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>[] b=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            int val=entry.getKey();
            if(b[freq]==null){
                b[freq]=new ArrayList<>();

            }
            b[freq].add(val);
        }
        int[] arr=new int[k];
        int i=0;
        for(int freq=nums.length;freq>=0;freq--){
            if(b[freq]!=null){
                for(int num:b[freq]){
                    arr[i++]=num;
                }
                if(i==k){
                    return arr;
                }
            }
        }
        return arr;
    }
}