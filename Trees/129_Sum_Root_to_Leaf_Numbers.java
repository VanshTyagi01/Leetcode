class Solution {
    int total = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return total;
    }
    public void helper(TreeNode root, int sum){
        if(root == null){
            return;
        }
        sum = sum*10 + root.val;
        if(root.left == null && root.right == null){
            total += sum;
        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
}