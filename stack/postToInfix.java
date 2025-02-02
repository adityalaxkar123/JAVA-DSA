import java.util.Scanner;
import java.util.Stack;

public class postToInfix {

    static boolean isNum(char rt){
        return rt>='0' && rt<='9';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        System.out.println("Enter the postfix expression");
        String str = sc.nextLine();

        for(int i = 0;i<str.length();i++){
            char s = str.charAt(i);
            if(isNum(s)){
                String r = "" + s;
                st.push(r);
            }
            else{
                String opnd2 = st.pop();
                String opnd1 = st.pop();
                String res = "("+opnd1+s+opnd2+")";
                st.push(res);
            }

        }
        if (st.size() == 1){
            System.out.println("the infix expression is: "+st.pop());
        }
        else{
            System.out.println("wrong input");
        }
    }
}
