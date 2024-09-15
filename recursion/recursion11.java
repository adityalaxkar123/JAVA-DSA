package recursion;
import java.util.Scanner;
public class recursion11 {

static void printArray(int arr[],int n){

if(n==arr.length){
    return;
}
else{
    System.out.print(arr[n]+"  ");
    n++;
    printArray(arr, n);
}
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int idx=0;
        printArray(arr,idx);
        sc.close();
    }
}
