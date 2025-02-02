import java.util.Stack;

public class infixEval {

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

    static int eval(int a,int b,char rt){
        switch (rt){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': if(b==0) {return -1;} return a/b;
            case '^': return (int)Math.pow(a,b);
            default:return -1;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> gt = new Stack<>();
        String str = "9-(5+3)*4/6";//-15

        for(int i = 0;i<str.length();i++){
            char r = str.charAt(i);
            if(isNum(r)){
                int x = r - '0';
                st.push(x);
            } else if (gt.isEmpty()) {
                gt.push(r);
            }
            else{
                while(!gt.isEmpty() && priority(r)<= priority(gt.peek())){
                    int opnd2 = st.pop();
                    int opnd1 = st.pop();
                    int res = eval(opnd1,opnd2,gt.pop());
                    st.push(res);
                }
                gt.push(r);
            }
        }

        while (gt.size()!=0){
            int opnd2 = st.pop();
            int opnd1 = st.pop();
            int res = eval(opnd1,opnd2,gt.pop());
            st.push(res);
        }
        System.out.println("evaluation is :"+st.pop());
    }
}
