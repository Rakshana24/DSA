class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')' && !stack.isEmpty())
            {
                stack.pop();
            }
            else{
                c++;
            }
        }
        return stack.size()+c;
    }
}