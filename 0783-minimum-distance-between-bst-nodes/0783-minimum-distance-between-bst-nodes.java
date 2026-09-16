class Solution {
    int min=Integer.MAX_VALUE;
    TreeNode prev = null;
    public void find(TreeNode root){
        if(root==null) return;
        find(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        prev=root;
        find(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        find(root);
        return min;
    }
}