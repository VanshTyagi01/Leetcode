class Solution {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        maxdepth(root, 1);
        return depth;
    }
    public void maxdepth(TreeNode root, int count){
        if(root == null){
            return;
        }
        depth = Math.max(depth, count);
        maxdepth(root.left, count+1);
        maxdepth(root.right, count+1);
    }
}