public class dequeArrayImplementation {

    public static class deque{
        int []a = new int[100];
        int f1 = -1;
        int r1 = -1;
        int f2 = -1;
        int r2 = -1;
        int size = 0;
        public void addFirst(int val){
            if(size == 99){
                System.out.println("queue overflow");
                return;
            }
            else if(f1 == -1 && r1 == -1){
                f1 = r1 = 0;
                size++;
            }
            else{
                r1++;
                size++;
            }
            a[r1] = val;
        }
        public void addLast(int val){
            if(size == 99){
                System.out.println("queue overflow");
                return;
            }
            else if(f2 == -1 && r2 == -1){
                f2 = r2 = 99;
                size++;
            }
            else{
                r2--;
                size++;
            }
            a[r2] = val;
        }
        public int removeFirst(){
            int val ;
            if(f1 == -1 && r1 == -1){
                System.out.println("queue underflow");
                return -1;
            } else if (f1 == r1) {
                val = a[f1];
                f1 = r1 = -1;
                size--;
            }
            else{
                val = a[f1++];
            }
            return val;
        }
        public int removeLast(){
            int val ;
            if(f2 == -1 && r2 == -1){
                System.out.println("queue underflow");
                return -1;
            } else if (f2 == r2) {
                val = a[f1];
                f2 = r2 = -1;
                size--;
            }
            else{
                val = a[f2--];
            }
            return val;
        }
       public void display(){
            if((f1 == -1 && r1 == -1) || (f2 == -1 && r2 == -1)){
                System.out.println("queue underFlow");
                return;
            }
           for (int i = f1; i <=r1 ; i++) {
               System.out.print(" "+a[i]);
           }
            for (int i = f2;i>=r2;i--){
                System.out.print(" "+a[i]);
            }
           System.out.println();
       }
       public int peekFirst(){
            if (f1 == -1 && r1 == -1){
                System.out.println("queue underflow");
                return -1;
            }
            return a[f1];
       }
        public int peekLast(){
            if (f2 == -1 && r2 == -1){
                System.out.println("queue underflow");
                return -1;
            }
            return a[f2];
        }
        public boolean isEmpty(){
            if(f1 == -1 && r1 == -1 && f2 == -1 && r2 == -1){
                return true;
            }
            return false;
        }

    }


    public static void main(String[] args) {
    deque d = new deque();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(4);
        d.addLast(5);
        d.addLast(6);
        d.display();
        d.removeFirst();
        d.display();
        d.removeLast();
        d.display();
        System.out.println(d.isEmpty());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
