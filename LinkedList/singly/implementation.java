package LinkedList.singly;

public class implementation {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
        public void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null)
                head = temp;
            else
                tail.next = temp;
            tail = temp;
            size++;
        }

        public void insertAt(int idx ,int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(idx == size){
                insertAtEnd(data);
                return;
            }
            if(idx == 0){
                insertAtBeginning(data);
                return;
            }
            if (idx<0) {
                System.out.println("wrong index");
                return;
            }
            for(int i = 1; i<=idx - 1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        public int getAt(int idx){
            Node temp = head;
            if (idx<0) {
                System.out.println("wrong index");
                return -1;
            }
            for(int i = 0 ; i<idx ; i++){
                temp=temp.next;
            }
            return temp.data;
        }

        public void insertAtBeginning(int data) {
            Node temp = new Node(data);
            if (tail == null)
                tail = temp;
            else
                temp.next = head;
            head = temp;
            size++;
        }
        public void display() {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int length() {//0(n)
            Node temp = this.head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        public void deleteAt(int idx){
            Node temp = head;
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            
            temp.next = temp.next.next;
            if (idx == size - 1) {
             tail = temp;  
            }
            size--;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // ll.insertAtEnd(5);
        // ll.insertAtEnd(6);
        // ll.display();
        System.out.println(ll.length());
        System.out.println(ll.size);
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(2);
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAt(2, -5);
        ll.display();
        // ll.insertAt(4, 12);
        // ll.display();
        // System.out.println(ll.tail.data);
        // ll.insertAt(0, 5);
        // ll.display();
        // System.out.println(ll.head.data);
        System.out.println(ll.getAt(3));
        System.out.println(ll.size);
        ll.deleteAt(3);//throw an error at index 0 so you have to implement it
        ll.display();
        System.out.println(ll.tail.data);

    }
}
