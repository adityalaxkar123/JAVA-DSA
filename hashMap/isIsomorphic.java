import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isIsomorphic {

    public static boolean isIsomorphicString(String str,String gtr){
    Map<Character , Character> mp = new HashMap<>();
        int n = str.length();
        int m = gtr.length();
        if(n != m){
            return false;
        }

        for (int i = 0;i<n;i++){
            Character a = str.charAt(i);
            Character b = gtr.charAt(i);
            if (mp.containsKey(a)){
                 if(mp.get(a) != b){
                     return false;
                 }
            }
            else if(mp.containsValue(b)){
                return false;
            }
            else{
                mp.put(a,b);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two string respectively");
        String str = sc.nextLine();
        String gtr = sc.nextLine();

        if(isIsomorphicString(str,gtr)){
            System.out.println("strings are isomorphic");
        }
        else{
            System.out.println("strings are not isomorphic");
        }
    }
}
