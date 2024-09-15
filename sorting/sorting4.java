package sorting;

public class sorting4 {

    static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    static void arrangeSort(int a[]){
        int l=0;
        int r=a.length - 1;
        while (l<r) {
            while (a[l] <0) l++;
            while (a[r] >=0) r--;
            if (l<r) {
                int temp = a[l];
                a[l]=a[r];
                a[r]=temp;
            }
        }
        
    }

    public static void main(String[] args) {
        int a[]={19,-20,7,-4,-13,-5,3};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        arrangeSort(a);
        print(a);
    }
}
