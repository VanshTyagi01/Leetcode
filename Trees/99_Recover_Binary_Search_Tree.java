class Solution {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        List<TreeNode> swap = new ArrayList<>();
        traverse(root, list);
        for(int i=1; i<list.size(); i++){
            if(list.get(i-1).val >= list.get(i).val){
                swap.add(list.get(i-1));
                swap.add(list.get(i));
            }
        }
        if(swap.size() == 2){
            TreeNode node1 = swap.get(0);
            TreeNode node2 = swap.get(1);
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
        else if(swap.size() == 4){
            TreeNode node1 = swap.get(0);
            TreeNode node2 = swap.get(3);
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
    }
    public void traverse(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        traverse(root.left, list);
        list.add(root);
        traverse(root.right, list);
    }
}