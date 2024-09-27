package LinkedList;

public class oddEvenSeperation {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(){

        }
    }

    public static Node Seperator(Node head){
        Node temp = head;
        Node h1 = new Node(100);
        Node even = h1;
        Node h2 = new Node(200);
        Node odd = h2;
        if(head == null || (head.next == null && head.val%2 == 0)){
            return head;
        }
        while (temp!=null){
            if(temp.val%2 == 0){
                even.next = temp;
                even = temp;
            }
            else{
                odd.next = temp;
                odd = temp;
            }
            temp = temp.next;
        }

        odd.next = h1.next;
        return h2.next;
    }

    public static void display(Node head){
        Node ptr = head;
        if(head == null){
            return;
        }
        else{
            while(ptr!=null){
                System.out.print(ptr.val+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Node a = new Node(2);
    Node b = new Node(8);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(6);
    Node f = new Node(7);
    Node g = new Node(9);
    Node h = new Node(10);
    a.next = b;
    b.next =c;
    c.next =d;
    d.next =e;
    e.next =f;
    f.next =g;
    g.next =h;
    h.next =null;
//    Node even = Seperator(a,0);
    Node newNode = Seperator(a);
//    display(even);
    display(newNode);
    }
}
