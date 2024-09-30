package linkedList.circularLinked.singly;

public class implementation {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static class CLL{
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
            }
            head = newNode;
            tail.next = head;
            size++;
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
        public void insertAtLast(int val){
            Node newNode = new Node(val);
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        public void insertAtIdx(int val,int idx){
            Node newNode = new Node(val);
            Node temp = head;
            if(idx == 0){
                insertAtHead(val);
                return;
            }
            for(int i = 1;i<idx;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        public void deleteAtHead(){
            head = head.next;
            tail.next = head;
            size--;
        }
        public void deleteAtLast(){
            Node temp = head;
            if(size == 1){
                head = null;
                tail = null;
                return;
            }
            while(temp.next.next!=head){
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
            size--;
        }
        public void deleteAtIdx(int idx){
            Node temp = head;
            if(idx == 0){
                deleteAtHead();
                return;
            }
            for (int i = 1; i <idx ; i++) {
                temp = temp.next;
            }
            if(tail == temp.next){
                tail = temp;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
    CLL ll = new CLL();
    ll.insertAtHead(5);
    ll.insertAtHead(6);
    ll.insertAtLast(7);
    ll.insertAtIdx(2,0);
    ll.insertAtIdx(3,3);
    /*2 6 5 3 7*/
//    ll.deleteAtHead();
//        ll.deleteAtLast();
        ll.deleteAtIdx(4);
    ll.display();
    System.out.println(ll.head.val);
    System.out.println(ll.tail.val);
    System.out.println(ll.size);
    }
}
