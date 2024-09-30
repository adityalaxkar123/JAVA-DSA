package LinkedList.singly;
/*using extra space*/
public class mergeLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node (int value){
            this.val = value;
        }
        public Node (){

        }
    }

    public static Node merge(Node h1,Node h2){//extra space
        Node temp1 = h1;
        Node temp2 = h2;
        Node head = new Node(100);
        Node temp = head;
        while (temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                Node newNode = new Node(temp1.val);
                temp.next = newNode;
                temp = newNode;
                temp1 = temp1.next;
            }
            else{
                Node newNode = new Node(temp2.val);
                temp.next = newNode;
                temp = newNode;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null){
            temp.next = temp1;
        }
        if(temp2!=null){
            temp.next = temp2;
        }
        return head.next;
    }
/*without extra space*/
    public static Node merge2(Node h1,Node h2){
        Node t1 = h1;
        Node t2 = h2;
        Node head = new Node(100);
        Node t = head;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t.next = t1;
                t = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            t.next = t1;
        }
        if(t2!=null){
            t.next = t2;
        }
        return head.next;
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
        Node b = new Node(2);
        Node c = new Node(3);
        Node A = new Node(1);
        Node B = new Node(5);
        Node C = new Node(4);
        a.next =b;
        b.next =c;
        A.next =B;
        B.next =C;
        Node newNode = merge2(a,A);
        display(newNode);
    }
}
