package LinkedList;

public class findInsertionOFLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(){
        }
    }

    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void Display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node intersectionNode(int l1,int l2,Node head1,Node head2){
        Node ans = new Node();
        if(l1>l2){
        for(int i = 1;i<=l1-l2;i++){
            head1 = head1.next;
        }
        }
        else{
            for(int i = 1;i<=l2-l1;i++){
                head2 = head2.next;
            }
        }
        while (head1!=null || head2!=null) {
            if(head1.data ==  head2.data){
                ans = head1;
                return ans;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        Node g = new Node(35);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Display(a);
        Node A = new Node(45);
        Node B = new Node(40);
        A.next = B;
        B.next = a;
        Display(A);
        Node newNode = intersectionNode(length(a), length(A),a,A);
        System.out.println(newNode.data);
    }
}
