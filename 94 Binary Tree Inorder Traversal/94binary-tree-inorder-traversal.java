/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inordr(root,ans);
        return ans;
    }
    static void inordr(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        inordr(root.left,ans);
        ans.add(root.val);
        inordr(root.right,ans);
    }
}