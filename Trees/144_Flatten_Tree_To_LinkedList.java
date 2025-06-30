// stack approach
// class Solution {
//     public void flatten(TreeNode root) {
//         if(root == null) return;
//         Stack<TreeNode> stack = new Stack<>();
//         helper(root, stack);
//         TreeNode pre = stack.pop();
//         pre.left = null;
//         pre.right = null;
//         while(!stack.isEmpty()){
//             TreeNode temp = stack.pop();
//             temp.left = null;
//             temp.right = pre;
//             pre = temp;
//         }
//     }
//     public void helper(TreeNode root, Stack<TreeNode> stack){
//         if(root == null) return;
//         stack.add(root);
//         helper(root.left, stack);
//         helper(root.right, stack);
//     }
// }
//   constant memory approach
class Solution {
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.left = null;
        root.right = pre;
        pre = root;
    }
}