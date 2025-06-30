class Solution {
    boolean isTrue = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        check(root, targetSum, 0);
        return isTrue;
    }
    public void check(TreeNode root, int target, int sum){
        if(root == null){
            return;
        }
        sum += root.val;
        if(root.left == null && root.right == null && sum == target) isTrue = true;
        check(root.left, target, sum);
        check(root.right, target, sum);
    }
}