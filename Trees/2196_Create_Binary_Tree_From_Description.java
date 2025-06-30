class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set= new HashSet<>();

        for(int[] desc: descriptions){
            int parentVal = desc[0], childVal = desc[1], isLeft = desc[2];

            if(!map.containsKey(parentVal)){
                map.put(parentVal, new TreeNode(parentVal));
            }
            TreeNode parent = map.get(parentVal);

            if(!map.containsKey(childVal)){
                map.put(childVal, new TreeNode(childVal));
            }
            TreeNode child = map.get(childVal);

            if(isLeft == 1){
                parent.left = child;
            }
            else{
                parent.right = child;
            }
            set.add(childVal);
        }
        for(int[] desc : descriptions){
            if(!set.contains(desc[0])){
                return map.get(desc[0]);
            }
        }
        return null;
    }
}