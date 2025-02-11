import java.util.*;

public class validAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character , Integer> mp = new HashMap<>();
        System.out.println("Enter the two string respectively");
        String str = sc.nextLine();
        String gtr = sc.nextLine();
        int n = str.length();
        int m = gtr.length();
        int i = 0;
        if(n != m){
            System.out.println("strings are not anagram");
        }
        else{
            for(i = 0;i<n;i++){
                char a = str.charAt(i);
                int s = (a - '0')%n;
                mp.put(a,s);
            }
            for (i = 0;i<m;i++){
                char a = gtr.charAt(i);
                int s = (a - '0')%m;
                if(!mp.containsKey(a)){
                    System.out.println("string is not anagram");
                    break;
                }
            }
        }
        if(i == m){
            System.out.println("string is anagram");
        }
    }
}
