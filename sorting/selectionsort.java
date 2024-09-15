package sorting;
import java.util.Scanner;
public class selectionsort {



    /*8 3 2 4 1*/
    /*1 3 2 4 8*/
    /*1 2 3 4 8*/
    
    static void selectionSort(int []a){
        int min_idx;// find max array index
        for (int i = 0; i < a.length - 1; i++) {
            min_idx=i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j]<a[min_idx]) {//find min element in array and swap it
                    min_idx=j;
                }
            }
            int temp = a[i];
            a[i]=a[min_idx];
            a[min_idx]=temp;
        }

    }

    static void printSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("After sorting");
        selectionSort(a);
        printSort(a);
        sc.close();
    }
}