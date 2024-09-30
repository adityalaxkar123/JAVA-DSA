package linkedList.doublyLinked;

public class basic {
    public static class Node {
        int val;
        Node next;
        Node prev;
        public Node (int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void insertionAtHead(Node head ,int t){
        Node newNode = new Node(t);
        newNode.next =head;
        head.prev = newNode;
        head = newNode;
    }

    public static void insertionAtTail(Node head,int t){
        Node newNode = new Node(t);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        newNode.next = null;
        newNode.prev = temp;
        temp.next = newNode;
        temp = newNode;
    }

    public static void insertAtIdx(Node head,int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        newNode.next = temp;
        temp.prev.next = newNode;
        newNode.prev = temp.prev;
        temp.prev = newNode;
    }

    public static Node deleteBeginning(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }

    public static void deleteAtLast(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next =null;
    }

    public static void deleteAtIdx(Node head,int idx){
        Node temp = head;
        for (int i = 1; i <=idx ; i++) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        a.next = b;
        b.next = c;
        b.prev =a;
        c.next =d;
        c.prev = b;
        d.next =e;
        d.prev = c;
        e.prev = d;
//        display(a);
//        displayrev(e);
//        displayRandom(b);
//        insertionAtTail(a,13);
//        insertAtIdx(a,3,9);
//       a = deleteBeginning(a);
//        deleteAtLast(a);
        deleteAtIdx(a,1);
        display(a);
    }
}
