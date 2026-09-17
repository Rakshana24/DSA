class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] newnums=new int[n*2];
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++){
            newnums[i]=nums[i];
            ans[i]=-1;
            ans[i+n]=-1;
            newnums[i+n]=nums[i];
        }
        for(int i=0;i<n*2;i++){
            while(!stack.isEmpty() && newnums[i]>newnums[stack.peek()]){
                int index=stack.pop();
                ans[index]=newnums[i];
            }
            stack.push(i);
        }
        int[] newArr = Arrays.copyOf(ans, n);
        return newArr;
        
    }
}