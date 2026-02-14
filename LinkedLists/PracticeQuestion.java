// Find out the node where the cycle begins, i.e. the 
// node at which the tail node points.
//Cycle Detection + Number of nodes in cycle
// Cycle Detection + Interesting Observation

package LinkedLists;

public class PracticeQuestion {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        Node temp = head;
        while(temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
}
 
 