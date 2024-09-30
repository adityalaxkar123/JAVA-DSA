package LinkedList.singly;

public class reverseLinkedList {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(){

        }
    }
    /*recursive approach (0)n time complexity and (0)n space complexity*/
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next =null;
        return newNode;
    }

    public static void display(Node head){
    if(head == null){
        System.out.println();
        return;
    }
    System.out.print(head.val+" ");
    display(head.next);
    }
 /*iterative approach (0)n time complexity and (0)1 space complexity*/
    public static Node reverse2(Node head){
        Node curr = head;
        Node Next = head;
        Node prev = null;
        while (Next != null || curr != null){
            Next = Next.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
     return prev;
    }


    public static void main(String[] args) {
    Node a = new Node(6);
    Node b = new Node(12);
    Node c = new Node(18);
    Node d = new Node(24);
    Node e = new Node(30);
    a.next =b;
    b.next =c;
    c.next=d;
    d.next=e;
    e.next=null;
    display(a);
    a = reverse2(a);
    display(a);
    }
}
