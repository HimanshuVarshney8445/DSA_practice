class Solution {
    long ans=0;
    public long add(TreeNode root){
        if(root==null) return 0;
        long leftSide = add(root.left);
        long rightSide = add(root.right);
        return root.val+leftSide+rightSide;
    }
    public long find(TreeNode root,long sum){
        if(root==null) return 0;
        long leftSide = find(root.left,sum);
        long rightSide = find(root.right,sum);
        long temp = root.val+leftSide+rightSide;
        ans=Math.max(ans,(sum-temp)*temp);
        return temp;
    }
    public int maxProduct(TreeNode root) {
        long sum = add(root);
        find(root,sum);
        return (int)(ans%1000000007);
    }
}