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
    ArrayList<String> list = new ArrayList<>();
    void dfs(TreeNode root, String path){
        if(root == null) return;
        path += (char)('a' + root.val);
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder(path);
            list.add(sb.reverse().toString());
            return;
        }
        dfs(root.left, path);
        dfs(root.right, path);
    }
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        Collections.sort(list);
        return list.get(0);
    }
}