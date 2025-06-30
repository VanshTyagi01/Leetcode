// recursion solution
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null && q == null) return true;
//         if(p == null || q == null || p.val != q.val) return false;
//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }
// }

// BSF approach
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() || !q2.isEmpty()){
            TreeNode a = q1.poll();
            TreeNode b = q2.poll();

            if(a == null && b == null) continue;
            if(a == null || b == null || a.val != b.val) return false;

            q1.add(a.left);
            q1.add(a.right);

            q2.add(b.left);
            q2.add(b.right);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}