import java.util.Scanner;
import java.util.Stack;
public class preToPost {

    static boolean isNum(char rt){
        return rt>='0' && rt<='9';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        System.out.println("Enter the prefix expression");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >=0 ; i--) {
            char s = str.charAt(i);
            if(isNum(s)){
                String a = "" + s;
                st.push(a);
            }
            else{
                String opnd1 = st.pop();
                String opnd2 = st.pop();
                String res = opnd1 + opnd2 + s;
                st.push(res);
            }
        }
        if(st.size() == 1){
            System.out.println("postfix expression is ;"+st.pop());
        }
        else{
            System.out.println("wrong input");
        }
    }
}
