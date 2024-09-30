package LinkedList.singly;

public class randomInLinkedList {

    public static class Node{
        int val;
        Node random;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node randomCopy(Node head){
        /*making a deep copy*/
        Node h1 = new Node(10);
        Node temp = h1;
        Node temp1 = head;
        while(temp1!=null){
            Node newNode = new Node(temp1.val);
            temp.next = newNode;
            newNode.next = null;
            temp = temp.next;
            temp1 = temp1.next;
        }
        /*link the deep copy with original copy*/
        temp1 = head;
        Node copy = h1.next;
        Node temp2 = h1.next; /*deep copy*/
        temp = h1;
        while(temp1!=null && temp2!=null){
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;

            temp.next =temp2;
            temp=temp.next;
            temp2=temp2.next;
        }

//        return h1.next;
        /*gives random value to deep copy*/
        Node copy2 = h1.next;
        temp1 = h1.next;
        temp2 = h1.next.next;
        while(temp1.next!=null && temp2.next!=null){
            if(temp1.random == null) {
                temp2.random = null;
            }
            else{
            temp2.random = temp1.random.next;
                }
            temp1 = temp1.next.next;
            temp2 = temp2.next.next;
        }
//        return h1.next;
        /*separate the linked copy to original*/
        Node copy3 = h1.next;
        temp1 = h1.next;
        temp2 = h1.next.next;
        Node h2 = temp2;
        while(temp1.next!=null && temp2.next!=null){
            temp1.next = temp2.next;
            temp1 = temp1.next;

            temp2.next = temp1.next;
            temp2 = temp2.next;
        }
    return h2;
    }

    public static void display(Node head){
        if(head == null) {
            System.out.println();
            return;
        }

        System.out.print(head.val+" ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(5);
        Node d = new Node(9);
        Node e = new Node(2);
        Node f = new Node(8);
        a.next = b;
        b.next =c;
        c.next=d;
        d.next =e;
        e.next = f;
        a.random =null;
        b.random = a;
        c.random = e;
        e.random = d;
        d.random = b;
        f.random = e;
        Node newNode = randomCopy(a);
        display(newNode);
        System.out.println(newNode.next.next.next.random);/*Node@7291c18f*/
    }
}
