class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;
        return build(head, temp);
    }
    public TreeNode build(ListNode low, ListNode high){
        if(high == null || low == high.next) return null;
        ListNode slow = low;
        ListNode fast = low;
        ListNode prev = null;
        while(fast != high && fast.next != high){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = build(low, prev);
        root.right = build(slow.next, high);
        return root;
    }
}