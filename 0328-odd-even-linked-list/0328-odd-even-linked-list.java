class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        boolean oddIncrement = true, evenIncrement = true;
        
        while (odd != null && even != null && (oddIncrement || evenIncrement)) {
            if (odd.next != null && odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            } else {
                oddIncrement = false;
            }
            
            if (even.next != null && even.next.next != null) {
                even.next = even.next.next;
                even = even.next;
            } else {
                evenIncrement = false;
            }
        }
        
        odd.next = evenHead;
        even.next = null;
        
        return head;
    }
}