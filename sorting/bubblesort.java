package sorting;
import java.util.Scanner;
public class bubblesort {

/*static void swap(int a,int b){
int temp=a;
a=b;
b=temp;
}*/


/*8 3 2 4 1*/
/*3 8 2 4 1*/
/*3 2 8 4 1*/
/*3 2 4 8 1*/
/*3 2 4 1 8*/
/*2 3 4 1 8*/
/*2 3 1 4 8*/
/*2 1 3 4 8*/
/*1 2 3 4 8*/
static void bubbleSort(int[]a){
for (int i = 1; i < a.length; i++) {//no. of passes
    boolean flag = false;
    for (int j = 0; j < a.length - i; j++) {
        if(a[j]>a[j+1]){
            int temp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = temp;
            flag = true;
        }
    }
    if (flag == false) {
        return;
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
        a[i]=sc.nextInt();
    }
    System.out.println("After sorting");
    bubbleSort(a);
    printSort(a);
    sc.close();

}
    
}
