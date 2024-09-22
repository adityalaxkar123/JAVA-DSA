package LinkedList;

/*remove nth node from end*/
public class nthNodeEndRemove {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node removeFromEnd(int idxEnd,Node head){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <=idxEnd; i++) {
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Display(a);
        a = removeFromEnd(6, a);
        Display(a);
    }
}
