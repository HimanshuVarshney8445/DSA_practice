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
    public int[] find(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] l = find(root.left);
        int[] r = find(root.right);
        int sum = root.val+l[0]+r[0];
        int num = 1+l[1]+r[1];
        int avg = sum/num;
        if(root.val==avg) count++;
        return new int[]{sum,num};
    }
    public int averageOfSubtree(TreeNode root) {
        find(root);
        return count;
    }
}