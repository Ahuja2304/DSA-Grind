class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        creater(root,list);
        return list.get(k-1);
    }
    public void creater(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        creater(root.left,list);
        list.add(root.val);
        creater(root.right,list);
    }
}