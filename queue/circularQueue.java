public class circularQueue {

    public static class Queue{
        int []q = new int[10];
        int rear = -1;
        int front = -1;
        int size = 0;
        public void add(int val){
            if((rear + 1)%10 == front){
                System.out.println("queue overflow");
                return;
            }
            else if (front == -1 && rear == -1){
                front = rear = 0;
                q[rear] = val;
                size++;
            }
            else{
                rear = (rear + 1)%10;
                q[rear] = val;
                size++;
            }
        }

        public int remove(){
            int val;
            if(front == -1 && rear == -1){
                System.out.println("queue underflow");
                return -1;
            } else if (front == rear) {
               val = q[front];
                front = -1;
                rear = -1;
                size--;
            }
            else{
               val = q[front];
               front = (front + 1)%10;
               size--;
            }
            return val;
        }
        public void display(){
            if(front == -1 && rear == -1){
                System.out.println("queue underflow");
                return;
            }
            for (int i = front;i<=rear;i++){
                System.out.print(" "+q[i]);
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(front == -1 && rear == -1){
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
        q.add(5);
        q.display();
        q.remove();
        q.display();
        q.add(6);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }
}
