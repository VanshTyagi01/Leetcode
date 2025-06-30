class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, targetSum, result, path, 0);
        return result;
    }
    public void helper(TreeNode root, int target, List<List<Integer>> result, List<Integer> path, int sum){
        if(root == null ) return;
        sum += root.val;
        path.add(root.val);
        if(sum == target && root.left == null && root.right == null){
            result.add(new ArrayList<>(path));
        }
        helper(root.left, target, result, path, sum);
        helper(root.right, target, result, path, sum);
        path.remove(path.size()-1);
    }
}