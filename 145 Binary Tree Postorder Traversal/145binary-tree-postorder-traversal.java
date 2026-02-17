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
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> ans=new ArrayList<>();
    bfs(root,ans);
    return ans;
    }
    void bfs(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        bfs(root.left,ans);
        bfs(root.right,ans);
        ans.add(root.val);
       }
    
}