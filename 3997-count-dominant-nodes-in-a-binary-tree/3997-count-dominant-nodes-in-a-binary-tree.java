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
    int count=0;
    public int find(TreeNode root){
        if(root==null) return 0;
        int left = find(root.left);
        int right = find(root.right);
        int max=Math.max(left,right);
        if(root.val>=max) count++;
        return Math.max(root.val,max);
    }
    public int countDominantNodes(TreeNode root) {
        find(root);
        return count;
    }
}