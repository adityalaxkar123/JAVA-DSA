package LinkedList;

/*find out the cycle in linked list*/
public class cycle {
    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static boolean cheakCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null){
            return false;
        }
        while(fast!=null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(15);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(25);
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = c;
        if(cheakCycle(a)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
