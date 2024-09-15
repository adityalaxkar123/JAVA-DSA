package recursion;
import java.util.Scanner;
public class recursion17 {


static String removeChar(String s,int idx){

if (idx == s.length()) {
    return "";
}    
String ans = removeChar(s, idx + 1);

char currChar = s.charAt(idx);

if(currChar != 'a'){
return currChar + ans;
}
else{
    return ans;
}
}

static String removeChar2(String s){

 if (s.length() == 0) {
    return "";
 }   
 String ans = removeChar2(s.substring(1));
 char currChar = s.charAt(0);

if(currChar != 'a'){
return currChar + ans;
}
else{
    return ans;
}
 
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        //int idx=0;
        System.out.println(removeChar2(s));
        sc.close();
    }
}
