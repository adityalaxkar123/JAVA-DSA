package recursion;
import java.util.Scanner;
public class recursion15 {


static void countOccurence(int arr[],int idx,int x){
if(idx == arr.length)
    return; 
if( x == arr[idx])
    System.out.print("  "+idx);
 countOccurence(arr, idx + 1, x);
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
        System.out.println("Enter the number to find the indices");
        int x=sc.nextInt();
        System.out.print("found at :");
        countOccurence(arr, idx, x);
        sc.close();
    }
}
