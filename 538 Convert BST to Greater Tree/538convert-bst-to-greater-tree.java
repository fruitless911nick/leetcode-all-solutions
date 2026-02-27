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
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode> list=new ArrayList<>();
        int sum=0;
        inorder(root,list);
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            list.get(i).val=sum+ list.get(i).val;
            sum=list.get(i).val;
        }
        return root;
    }
    void inorder(TreeNode root,ArrayList<TreeNode> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}