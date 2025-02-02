import java.util.Stack;

public class toPrefix {
    static boolean isNum(char rt){
        return rt>='0' && rt<='9';
    }
    static int priority(char rt){
        switch (rt){
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<Character> gt = new Stack<>();
        String str = "3-2*5/2+9";
        for (int i = 0;i<str.length();i++){
            char r = str.charAt(i);
            if (isNum(r)) {
                String gtr = "" + r;
                st.push(gtr);
            } else if (gt.isEmpty()) {
                gt.push(r);
            } else{
                while (!gt.isEmpty() && priority(r)<=priority(gt.peek())){
                    String opnd2 = st.pop();
                    String opnd1 = st.pop();
                    String res = gt.pop() + opnd1 + opnd2;
                    st.push(res);
                }
                gt.push(r);
            }
        }
    while (!gt.isEmpty()){
        String opnd2 = st.pop();
        String opnd1 = st.pop();
        String res = gt.pop() + opnd1 + opnd2;
        st.push(res);
    }
        System.out.println("prefix expression is :"+st.pop());
    }
}
