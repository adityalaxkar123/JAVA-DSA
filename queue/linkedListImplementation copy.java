public class linkedListImplementation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node (){

        }
    }

    public static class Queue{
        Node front = null;
        Node rear = null;

        public void add(int val){
            Node newNode = new Node(val);
            if(front == null && rear == null){
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
        }
        public int remove(){
            int a;
            if(front == null && rear == null){
                System.out.println("queue underflow");
                return -1;
            }
            else{
                a = front.val;
                front = front.next;
            }
            return a;
        }

        public int peek(){
            if(front == null && rear == null){
                System.out.println("queue underflow");
                return -1;
            }
            return rear.val;
        }

        public void display(){
            if(front == null && rear == null){
                System.out.println("queue underflow");
            }
            Node ptr = front;

            while (ptr!=rear){
                System.out.print(" "+ptr.val);
                ptr = ptr.next;
            }
            System.out.println(" "+ rear.val);
        }

        public boolean isEmpty(){
            if(front == null && rear == null){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());


    }
}
