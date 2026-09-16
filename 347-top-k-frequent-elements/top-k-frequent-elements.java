class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int[] ar=new int[k];
        ArrayList<Map.Entry<Integer, Integer>> list =new ArrayList<>(map.entrySet());
        
        int i=0;
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Integer,Integer> entry: list){
            
            ar[i++]=entry.getKey();
            
            if(i>=k){
                break;
            }
        }      
        return ar;
        
    }
}