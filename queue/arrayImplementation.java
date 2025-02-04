public class arrayImplementation {

    public static class Queue{
           int rear = -1;
           int front = -1;
           int []a = new int[10];
           public void add(int x){
               if(front == -1 && rear == -1){
                  front = rear = 0;
               }
               else if(rear == a.length - 1){
                   System.out.println("queue overflow");
                   return;
               }
               else{
                   rear++;
               }
               a[rear] = x;
           }
           public int remove(){
               int x;
               if(front == -1 && rear == -1){
                   System.out.println("queue underflow");
                   return -1;
               } else if (front == rear) {
                   x = a[front];
                    front = rear = -1;
               }
               else{
                   x = a[front];
                   front++;
               }
               return x;
           }
           public int peek(){
               if(front == -1 && rear == 1){
                   System.out.println("queue underflow");
                   return -1;
               }
               return a[front];
           }
           public void display(){
               for(int i = front;i<=rear;i++){
                   System.out.print(" "+a[i]);
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
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
