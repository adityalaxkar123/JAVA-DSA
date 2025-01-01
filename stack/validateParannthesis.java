import java.util.Scanner;
import java.util.Stack;

public class validateParannthesis {

    static int minBracketRemoveToBalance(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        st.push('r');
        int k =0;
        for(int i = 0;i<n;i++){
            char p = str.charAt(i);
            if(p == '(' || p == '{' || p == '['){
                st.push(p);
            }
            else{
                if( st.peek() == '(' &&  p == ')' || st.peek() == '{'&&  p == '}' || st.peek() == '[' && p == ']'){
                    st.pop();
                    k++;
                }
            }
        }

        return n - (2*k);
    }

    static boolean validateBrackets(String str){
    Stack<Character> st = new Stack<>();
    for (int i = 0;i<str.length();i++){
        char p = str.charAt(i);
        if(p == '(' || p == '{' || p == '['){
            st.push(p);
        }
        else{
            if(st.isEmpty()){
                return false;
            }
            if( st.peek() == '(' &&  p == ')' || st.peek() == '{'&&  p == '}' || st.peek() == '[' && p == ']'){
                st.pop();
            }
        }
    }
    if(st.isEmpty()){
        return true;
    }

     return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(validateBrackets(str)){
            System.out.println("brackets are in correct order");
        }
        else{
            System.out.println("brackets are not in correct order for balance it\n we require "+minBracketRemoveToBalance(str)+" bracket to be removed from string");
        }
    }
}
