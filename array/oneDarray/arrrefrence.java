import java.util.Scanner;
public class arrrefrence{
    
    
    static void printArray(int[] arr){
         for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        
        
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int [] arr = new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;
        System.out.println("original array");
        
        printArray(arr);
     //trying to copy arr to arr_2
     System.out.println("copied array");
     int [] arr_2=arr;  //arr.clone();     
         printArray(arr_2);
        //changes some value of arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing arr_2");
        printArray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
        sc.close();
    }
}