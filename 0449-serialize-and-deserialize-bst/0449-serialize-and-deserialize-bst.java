/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    private void create(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        create(root.left,sb);
        create(root.right,sb);
    }
    public String serialize(TreeNode root) {
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();
        create(root,sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    private int index;
    private TreeNode build(String[] str){
        if(index>=str.length || str[index].equals("null")){
            index++;
            return null;
        }
        TreeNode temp = new TreeNode(Integer.parseInt(str[index]));
        index++;
        temp.left=build(str);
        temp.right=build(str);
        return temp;
    }
    public TreeNode deserialize(String data) {
        if(data==null) return null;
        String[] str = data.split(",");
        index=0;
        return build(str);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;