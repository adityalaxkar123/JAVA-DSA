package recursion;
import java.util.Scanner;
public class recursion18 {

static String reverseString(String s,int idx){

/*if(idx == -1){
return;
}
 System.out.print(s.charAt(idx));
 reverseString(s, idx - 1);*/

if (idx == s.length()) {
    return "";
}

String smallAns = reverseString(s,idx + 1);
return smallAns + s.charAt(idx);
}

static boolean isPalindrome(String s,int l,int r){

if(l>=r){
    return true;
}
return (s.charAt(l) == s.charAt(r)) && isPalindrome(s, l + 1, r - 1);


}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        /*int idx = 0;
        String rev = reverseString(s,idx);
        sc.close();
        if (rev.equals(s)) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }*/
        System.out.println(isPalindrome(s, 0, s.length() - 1));
        sc.close();
    }
}
