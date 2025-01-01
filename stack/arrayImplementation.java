public class arrayImplementation {

    public static class stack{
        int []stack= new int[10];
        int top = -1;
        public void push(int x){
            if(top == 9){
                System.out.println("stack overflow");
                return;
            }
            top++;
            stack[top] = x;
        }
        public int pop(){
            if(top == -1){
                System.out.println("stack underflow");
            }
            int y = stack[top--];
            return y;
        }
        public int peek(){
            if(top == -1){
                System.out.println("stack underflow");
            }
            return stack[top];
        }
        public boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }
        public boolean isFull(){
            if (top == 9){
                return true;
            }
            return false;
        }
        public int capacity(){
            return stack.length;
        }
        public void display(){
            for(int i = top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
        public int size(){
            return top + 1;
        }
    }

    public static void main(String[] args) {
    stack name = new stack();
    name.push(8);
    name.push(9);
    name.display();
    name.pop();
    name.display();
    System.out.println(name.peek());
    System.out.println(name.isEmpty());
    System.out.println(name.isFull());
    System.out.println(name.capacity());
    System.out.println(name.size());
    }
}

