//  BSF Approach
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> result= new ArrayList<>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         if(root == null) return result;
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             int size = queue.size();
//             for(int i=0; i<size; i++){
//                 TreeNode node = queue.poll();
//                 if(i == size-1){
//                     result.add(node.val);
//                 }
//                 if(node.left != null) queue.offer(node.left);
//                 if(node.right != null) queue.offer(node.right);
//             }
//         }
//         return result;
//     }
// }

//  DFS Approach
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        helper(root, 0, result);
        return result;
    }
    public void helper(TreeNode root, int level, List<Integer> result){
        if(root == null) return;
        if(level == result.size()){
            result.add(root.val);
        }
        helper(root.right, level+1, result);
        helper(root.left, level+1, result);
    }
}