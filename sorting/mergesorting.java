package sorting;

public class mergesorting {

    static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }

 /*8 3 2 4 1*/
 /*recursive calls*/
 /*8 3 2*/    /*4 1*/
/*83 */ /*2 */ /*4*/ /*1*/
/*8*/  /*3*/
/*3 8*/ /*2*/  /*4*/ /*1*/
/*2 3 8*/   /*1 4*/

/*1 2 3 4 8*/ 
    static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i, j, k;
        for ( i = 0; i < n1; i++)
            left[i] = a[l + i];
        for (j = 0; j < n2; j++)
            right[j] = a[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < n1) {
            a[k++] = left[i++];
        }
        while (j < n2) {
            a[k++] = right[j++];
        }
    }

    static void mergeSorting(int a[], int l, int r) {
        if (l >= r)
            return;
        int mid = (l + r) / 2;
        mergeSorting(a, l, mid);
        mergeSorting(a, mid + 1, r);
        merge(a, l, mid, r);

    }

    public static void main(String[] args) {
        int a[] = { 8,3,2,4,1 };
        int n = a.length;
        System.out.println("before sorting");
        print(a);
        System.out.println();
        System.out.println("after sorting");
        mergeSorting(a, 0, n - 1);
        print(a);

    }
}
