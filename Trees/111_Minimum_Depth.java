// DFS approach
// class Solution {
//     int depth = Integer.MAX_VALUE;
//     public int minDepth(TreeNode root) {
//         if(root == null) return 0;
//         maxdepth(root, 1);
//         return depth;
//     }
//     public void maxdepth(TreeNode root, int count){
//         if(root == null){
//             return;
//         }
//         if(root.left==null && root.right==null){
//             depth = Math.min(depth, count);
//             return;
//         }
//         maxdepth(root.left, count+1);
//         maxdepth(root.right, count+1);
//     }
// }

// BFS approach
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right==null){
                    return depth;
                }

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}
