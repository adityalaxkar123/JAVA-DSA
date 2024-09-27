package LinkedList;

public class removeDuplicates {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(){

        }
    }

    public static Node removeDuplicatesElement(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp1 = head;
        Node h1 = new Node(100);
        Node temp2 = h1;
        temp2.next = temp1;
        temp2 = temp2.next;
        temp1 = temp1.next;



        while(temp1!=null){
            if(temp1.val == temp2.val){
                temp1 = temp1.next;
                temp2.next = temp1;
            }
            if(temp1 == null) break;
            else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return h1.next;
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
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(4);
        Node i = new Node(5);
        Node j = new Node(5);
        Node k = new Node(5);
        Node l = new Node(6);
        Node m = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        j.next = k;
        k.next = l;
        l.next = m;
        m.next = null;

        Node newNode = removeDuplicatesElement(a);
        display(newNode);
    }
}
