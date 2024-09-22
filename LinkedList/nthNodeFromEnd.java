package LinkedList;
/*finding nth node from End*/
public class nthNodeFromEnd {

    public static class  Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    }

    public static Node getNode(int idxEnd,int length,Node head) {
    int idxSt = length - idxEnd + 1;
    Node temp = head;
    for (int i = 1; i < idxSt; i++) {
        temp = temp.next;
    }
        return temp;
    }

    public static Node getNodeModified(int idxEnd,Node head){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <=idxEnd; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void Display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        a.next=b;
        b.next=c;
        c.next =d;
        d.next =e;
        e.next =f;
        Display(a);
        // System.out.println(length(a));
        // Node g = getNode(2, length(a), a);//2 loop used
        // System.out.println(g.data);
        Node get = getNodeModified(2, a);
        System.out.println(get.data);
    }
}
