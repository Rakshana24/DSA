class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        int left=0,right=0;
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<k;i++){
            map2.put(p.charAt(i),map2.getOrDefault(p.charAt(i),0)+1);
        }
        int c=0;
        for(right=0;right<n;right++){
            char ch=s.charAt(right);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(right-left+1>k){
                char remove=s.charAt(left);
                map1.put(remove,map1.get(remove)-1);
                if (map1.get(remove) == 0) {
                    map1.remove(remove);
                }
                left++;
            }
            if(right-left+1==k){
                if(map1.equals(map2)){
                    list.add(left);
                }
            }
        }
        return list;

    }
}