package recursion;
import java.util.Scanner;
public class recursion21 {


static void  stringEval(String dig , String [] kp ,String res ){

if (dig.length() == 0) {
    System.out.print(res + "  ");
    return;
}

int currNum = dig.charAt(0) - '0';
String currChoice = kp[currNum];

for (int i = 0; i < currChoice.length(); i++) {
    stringEval(dig.substring(1), kp, res + currChoice.charAt(i));
}

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "23";
        String [] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String res = "";
        stringEval(s, kp, res);
        sc.close();
    }

}
