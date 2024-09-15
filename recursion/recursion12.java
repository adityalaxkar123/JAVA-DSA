package recursion;
import java.util.Scanner;
public class recursion12 {

static int maxValue(int arr[],int n){
if(n == arr.length -1){
    return arr[n];
}
    int smallans=maxValue(arr, n+1);
    return Math.max(arr[n], smallans);

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int idx=0;
        System.out.println("max value of array is: "+maxValue(arr,idx));
        sc.close();
    }
}
