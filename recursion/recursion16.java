package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class recursion16 {


static ArrayList<Integer> allIndices(int arr[],int x, int n, int idx){

if(idx >= n){
    return new ArrayList<Integer>();
}
ArrayList<Integer> ans = new ArrayList<>();
if(arr[idx] == x){
    ans.add(idx);
}

ArrayList<Integer> smallans= allIndices(arr, x, n, idx + 1);
ans.addAll(smallans);
return ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,4,3,4,4};
        int x=4;
        int n=arr.length;
        int idx=0;
        ArrayList<Integer> ans = allIndices(arr,x,n,idx);
         for (Integer i : ans) {
            System.out.println(i);
         }
         sc.close();   
    }    
}
