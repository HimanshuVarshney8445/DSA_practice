class Solution {
    public void find(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        list.add(root.val);
        find(root.left,list);
        find(root.right,list);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        find(root,list);
        Collections.sort(list);
        int num = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=num) return list.get(i);
        }
        return -1;
    }
}