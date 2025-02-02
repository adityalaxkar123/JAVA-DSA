import java.util.Scanner;
import java.util.Stack;
public class preEval {

    static boolean isNum(char rt){
        return rt>='0' && rt<='9';
    }

    static int solve(int a,int b,char s){
        switch (s){
            case'+': return a+b;
            case'-': return a-b;
            case'*': return a*b;
            case'/': return a/b;
            case'^': return (int)Math.pow(a,b);
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prefix expression");
        String str = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        for(int i = str.length() - 1;i>=0;i--){
            char s = str.charAt(i);
            if(isNum(s)){
                int x = s - '0';
                st.push(x);
            }
            else{
                int opnd1 = st.pop();
                int opnd2 = st.pop();
                int res = solve(opnd1,opnd2,s);
                st.push(res);
            }
        }

        if(st.size() == 1){
            System.out.println("Evalutation is :"+st.pop());
        }
        else{
            System.out.println("invalid input");
        }
    }
}
