package linkedList.doublyLinked;

public class implementation {
    public static class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static class DLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public  void insertAtHead(int val){
            Node newNode = new Node(val);
            if(tail == null){
               tail = newNode;
            }
            else{
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
            size++;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public void insertAtLast(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            }
            else{
                tail.next = newNode;
                newNode.prev = tail;
            }
            tail = newNode;
            size++;
        }
        public  void insertAtIdx(int val,int idx){
            Node newNode = new Node(val);
            Node temp = head;
            if(idx == 0){
                insertAtHead(val);
                return;
            }
            for(int i = 1;i<=idx;i++){
                temp = temp.next;
            }
            newNode.next = temp;
            temp.prev.next = newNode;
            newNode.prev = temp.prev;
            temp.prev = newNode;
            size++;
        }
        public void deletionAtHead(){
            head = head.next;
            head.prev = null;
            size--;
        }
        public void deletionAtTail(){
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        public void deletionAtIdx(int idx){
            Node temp = head;
            if(idx == 0){
                deletionAtHead();
                return;
            }
            if(idx == size - 1){
                deletionAtTail();
                return;
            }
            for(int i = 1;i<=idx;i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    }

    public static void main(String[] args) {
    DLL ll = new DLL();
    ll.insertAtHead(5);
    ll.insertAtHead(4);
    ll.insertAtLast(6);
    ll.insertAtIdx(7,0);
    /*7 4 5 6*/
//    ll.deletionAtHead();
//       ll.deletionAtTail();
        ll.deletionAtIdx(3);
    //        System.out.println(ll.size);
    ll.display();
//        System.out.println(ll.head.val);
//        System.out.println(ll.tail.val);

    }
}
