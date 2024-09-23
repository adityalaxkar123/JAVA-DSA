package LinkedList;
public class FindMiddle {

    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){//while(fast!=null && fast.next!=null) for right middle when even
            
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
        e.next =f;
        Node ans = findMiddle(a);
        System.out.println(ans.data);
    }
}