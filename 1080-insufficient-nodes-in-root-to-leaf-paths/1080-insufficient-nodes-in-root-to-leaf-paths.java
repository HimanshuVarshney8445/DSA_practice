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
    public TreeNode find(TreeNode root,int limit){
        if(root==null) return null;
        if(root.left==null && root.right==null){
            if(root.val<limit){
                return null;
            }
            return root;
        }
        root.left = find(root.left,limit-root.val);
        root.right = find(root.right,limit-root.val);
        if(root.left == null && root.right == null){
            return null;
        }
        return root;
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return find(root,limit);
    }
}