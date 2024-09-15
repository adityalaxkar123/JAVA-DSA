package sorting;
import java.util.Scanner;
public class sorting1 {

static void zeroOrder(int a[]){

for (int i = 0; i < a.length - 1; i++) {
    for (int j = i + 1; j < a.length; j++) {
        if (a[i] == 0 && a[j] !=0) {
            int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
            break;
        }
    } 
}

/*for (int i = 0; i < a.length - 1; i++) {
    for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] == 0 && a[j + 1] !=0) {
            int temp =a[j];
            a[j]=a[j + 1];
            a[j + 1]=temp;
        }
    } 
}
 */

}

    static void printSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
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
        zeroOrder(a);
        printSort(a);
        
        sc.close();
    }
}
