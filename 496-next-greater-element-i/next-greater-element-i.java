class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            ans[i]=-1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && nums2[i]>nums2[stack.peek()]){
                int index=stack.pop();
                ans[index]=nums2[i];
            }
            map.put(nums2[i],i);
            stack.push(i);
        }
        int[] finalans=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            finalans[i]=ans[map.get(nums1[i])];
        }
        return finalans;



    }
}