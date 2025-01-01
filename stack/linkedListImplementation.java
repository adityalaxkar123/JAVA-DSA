public class linkedListImplementation {

    public static class node{
        int val;
        node next;
        public node(int val){
            this.val = val;
        }
        public node(){

        }
    }

    public static class stack{
        int size = 0;
        node top = null;

        public void push(int val){
            node newNode = new node(val);
            if(top == null){
                top = newNode;
            }
            else{
                newNode.next = top;
                top = newNode;
            }
            size++;
        }
        public int pop(){
            if(top == null){
                System.out.println("stack underflow");
                return -1;
            }
            int x = top.val;
            top = top.next;
            size--;
            return x;
        }
        public int peek(){
            if(top == null){
                System.out.println("stack underflow");
                return -1;
            }
            return top.val;
        }
        public boolean isEmpty(){
            if (top == null){
                return true;
            }
            return false;
        }
        public int getSize(){
            return size;
        }
        public void display(){
            node ptr = new node();
            ptr = top;
            while (ptr!=null){
                System.out.print(ptr.val+" ");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    stack ex = new stack();
    ex.push(5);
    ex.push(6);
    ex.push(7);
    ex.display();
    ex.pop();
    ex.display();
    System.out.println(ex.peek());
    System.out.println(ex.isEmpty());
    System.out.println(ex.getSize());
    }
}
