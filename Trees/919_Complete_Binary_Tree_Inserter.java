class CBTInserter {
    TreeNode root;
    Queue<TreeNode> queue;
    public CBTInserter(TreeNode root) {
        this.root = root;
        this.queue = new LinkedList<>();
        queue.add(root);

        while(queue.peek().left!=null && queue.peek().right != null){
            TreeNode temp = queue.poll();
            queue.add(temp.left);
            queue.add(temp.right);
        }
        if(queue.peek().left != null) queue.add(queue.peek().left);
    }
    
    public int insert(int val) {
        TreeNode current = queue.peek();
        TreeNode node = new TreeNode(val);
        if(current.left == null){
            current.left = node;
            queue.add(node);
            return current.val;
        }
        else{
            current.right = node;
            // queue.add(current.left);
            queue.add(node);
            return queue.poll().val;
        }
    }
    
    public TreeNode get_root() {
        return root;
    }
}