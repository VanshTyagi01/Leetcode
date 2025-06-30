class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode treeL, TreeNode treeR){
        if(treeL == null && treeR == null) return true;
        if(treeL == null || treeR == null || treeL.val != treeR.val) return false;
        return helper(treeL.left, treeR.right) && helper(treeL.right, treeR.left);
    }
}