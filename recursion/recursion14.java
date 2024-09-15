package recursion;
import java.util.Scanner;
public class recursion14 {


static int searchArray(int arr[],int x,int idx){//find first index also included

if(x == arr[idx]){
    return 1;
    //return idx;
}

if(idx == arr.length - 1){
    return 0;
    //return -1;

}

return searchArray(arr, x, idx + 1);


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
        int x;
        int idx=0;
        System.out.println("Enter the number to be searched");
        x=sc.nextInt();
        if(searchArray(arr,x,idx) == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();

        /*System.out.println("at index :"+ searchArray(arr, x, idx));
        sc.close();*/

    }
}
