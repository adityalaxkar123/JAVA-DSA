package recursion;
import java.util.Scanner;
public class recursion13 {


static int sumOfArray(int arr[],int idx){

if(idx == arr.length - 1){
    return arr[idx];
}

return arr[idx] + sumOfArray(arr, idx + 1);
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
        System.out.println(sumOfArray(arr,idx));
        sc.close();
    }
}
