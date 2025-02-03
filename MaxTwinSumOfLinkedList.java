class Solution {
    public int pairSum(ListNode head) {
        int ans = 0;
        ListNode newList = null;
        ListNode current = head;
        ListNode currHalf = head;
        
        while (currHalf != null && currHalf.next != null) {
            currHalf = currHalf.next.next;
            ListNode temp = current.next;
            current.next = newList;
            newList = current;
            current = temp;
        }

        while (current != null) {
            ans = Math.max(ans, current.val + newList.val);
            current = current.next;
            newList = newList.next;
        }
        
        return ans;
    }
}