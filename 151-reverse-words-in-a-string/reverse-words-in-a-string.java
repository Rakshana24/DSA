class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] arr=s.split(" ");
        int left=0;
        int right=arr.length-1;
        System.out.print(arr.length);
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String result=String.join(" ",arr);
        return result;


    }
}