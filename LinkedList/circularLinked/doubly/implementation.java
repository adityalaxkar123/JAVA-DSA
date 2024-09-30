package linkedList.circularLinked.doubly;

public class implementation {

    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static class CDLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void insertAtHead(int val){
            Node newNode = new Node(val);
            if(tail == null){
                tail = newNode;
            }
            else{
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
            tail.next = head;
            head.prev = tail;
            size++;
        }

        public void insertAtLast(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }
            else{
                newNode.prev = tail;
                tail.next = newNode;
            }
            tail = newNode;
            tail.next = head;
            head.prev = tail;
            size++;
        }

        public void insertAtIdx(int val,int idx){
            if(idx == size) return;
            Node newNode = new Node(val);
            Node temp = head;
            if(idx == 0){
                insertAtHead(val);
                return;
            }
            for(int i = 1;i<idx;i++){
                temp =temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }

        public void deleteAtHead(){
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
        }

        public void deleteAtLast(){
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        }

        public void deleteAtIdx(int idx){
            Node temp = head;
            if(idx == 0) {
                deleteAtHead();
               return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.next.prev = temp;
            size--;
        }

        public void display(){
            Node temp = head;
            System.out.print(temp.val+" ");
            temp = temp.next;
            while(temp!=head){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CDLL ll = new CDLL();
        ll.insertAtHead(3);
        ll.insertAtHead(6);
        ll.insertAtLast(9);
        ll.insertAtLast(12);
        ll.insertAtIdx(9,0);
        ll.insertAtIdx(8,4);
        ll.deleteAtHead();
        ll.deleteAtLast();
        ll.deleteAtIdx(3);
        ll.display();
        System.out.println(ll.head.val);
        System.out.println(ll.tail.val);
        System.out.println(ll.size);
    }
}
