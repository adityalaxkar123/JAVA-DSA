package LinkedList.singly;

public class deleteMiddleElement {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next.next!=null && fast.next.next.next.next!=null){//while(fast.next.next.next!=null && fast.next.next.next.next!=null) for delete element when even case rightmost
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
//        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next =f;
        Node ans = deleteMiddle(a);
        display(ans);
    }
}
