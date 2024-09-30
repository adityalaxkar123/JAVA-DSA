package LinkedList.singly;
/*find out the node at which cycle begins*/
public class cycle2 {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(){
        }
    }

    public static ListNode CycleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode h1 = new ListNode(-1);
        if(head == null || head.next == null){
            return head;
        }
        while(fast!=null){
             if(slow == null) return h1;
             slow = slow.next;
             if(fast.next == null) return h1;
             fast = fast.next.next;
             if(fast == slow) break;
        }
        ListNode temp = head;
        while(temp!=slow) {
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(15);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(25);
        ListNode f = new ListNode(30);
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;
        f.next = d;
        ListNode newNode = CycleNode(a);
        System.out.println(newNode.val);
    }
}
