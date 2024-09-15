package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class recursion19 {

static ArrayList<String> getSSQ(String s){

ArrayList<String> ans = new ArrayList<>();

if (s.length() == 0) {
    ans.add(""); 
    return ans;
}
ArrayList<String> smallAns = getSSQ(s.substring(1));
char curr = s.charAt(0);

for (String ss : smallAns) {
    ans.add(ss);
    ans.add(curr +ss);
}
return ans;
}

static void printSSQ(String s,String currAns){


if (s.length() == 0) {
    System.out.println(currAns);
    return;
}
char curr = s.charAt(0);
String remaString = s.substring(1);
printSSQ(remaString, currAns + curr);
printSSQ(remaString, currAns);
}

static void arraySSQ(int arr1[],int idx,int sum){

if(idx >= arr1.length){
    System.out.println(sum);
return;
}
arraySSQ(arr1, idx + 1, sum + arr1[idx]);
arraySSQ(arr1, idx + 1, sum);


}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       //String s = "abc";
       //System.out.println(getSSQ(s));
        //String currAns ="";
        //printSSQ(s, currAns);
        int arr1[]={2,4,5};
        int idx = 0;
        int sum = 0;
        arraySSQ(arr1,idx,sum);
       sc.close();
    }
}
