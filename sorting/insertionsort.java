package sorting;
import java.util.Scanner;
public class insertionsort {

    static void insertionSort(int []a){
        for (int i = 1; i < a.length; i++) {
            int j=i;

            /*8 3 2 4 1 */
            /*3 8 2 4 1*/
            /*3 2 8 4 1 */
            /*2 3 8 4 1 */
            /*2 3 4 8 1 */
            /*2 3 4 1 8 */
            /*2 3 1 4 8 */
            /*2 1 3 4 8 */
            /*1 2 3 4 8 */
            while (j>0 && a[j]<a[j - 1]) {//we swap ith element to (i-1)th element whether it is big or not until  it gets right position 
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }

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
        insertionSort(a);
        printSort(a);
        
        sc.close();
    }
}
