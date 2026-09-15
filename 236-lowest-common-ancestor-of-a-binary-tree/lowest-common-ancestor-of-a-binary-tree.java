/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int c=0;
    TreeNode ans;
    boolean ps=false,qs=false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        f(root,p,q);
        return ans;
        
    }
    boolean f(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return false;
        }
        boolean left=f(root.left,p,q);
        boolean right=f(root.right,p,q);
        boolean current=(root==p || root==q);
        if(left && right || current &&(left||right)){
         ans=root;
        }
        return left || right || current;
    }
}