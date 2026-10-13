class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Character> list=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        int n1=s1.length();
        int n2=s2.length();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n1;i++){
           list2.add(s1.charAt(i));
        }
        char[] ctarr=s1.toCharArray();
        Arrays.sort(ctarr);
        Collections.sort(list2);
        int left=0;
        for(int i=0;i<n2;i++){
          if(list2.contains(s2.charAt(i)) && i+n1<=n2){
            String sample="";
            sample+=s2.substring(i,i+n1);
            char[] charr=sample.toCharArray();
            Arrays.sort(charr);
            
            if(Arrays.equals(charr,ctarr)){
                return true;
            }
          }  
        }
         return false;
    }
}