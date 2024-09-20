package LinkedList;

public class basics {

    public static void insertAtEnd(Node t,int data){
        Node newNode = new Node(data);
        Node head = t;
        while (head.next !=null) {
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void display(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }

    public static void Display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;//value
        Node next;//address of next node
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);//null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3  9  8  16
        a.next = b;// 5-> 3  9  8  16
        // System.out.println(a);//@5f5a92bb
        // System.out.println(a.next);//@6fdb1f78
        // System.out.println(b);//@6fdb1f78
        // System.out.println(c);//@51016012
        // to print data
        // System.out.println(b.data);
        // System.out.println(a.next.data);
        b.next = c;// 5-> 3 -> 9  8  16
        c.next = d;// 5-> 3 -> 9 -> 8  16
        d.next = e;// 5-> 3 -> 9 -> 8 -> 16
        e.next = null;//or already it points null default value
        /*manual method to diaplay linked list*/
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        /*loop method*/
        // Node temp = a;
        // for (int i = 1; i <=5; i++) {
        //     System.out.print(temp.data+" ");
        //     temp =temp.next;
        // }
        /*implementation using while loop*/
        // Display(a);
        // System.out.println();
        // display(a);
        // System.out.println();
        // System.out.println(length(a));
        insertAtEnd(a, 78);
        Display(a);
        System.out.println(a.data);
    }
}
