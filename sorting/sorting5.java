package sorting;

public class sorting5 {

    static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
//dutch national flag algorithm
    static void specificSort1(int a[]){
        int c_0=0,c_1=0,c_2=0;
       for (int j : a) {
            if(j == 0) c_0++;
            else if(j == 1) c_1++;
            else c_2++;
       }
       int k=0;
       while (c_0 > 0) {
        a[k++]=0;
        c_0--;
       }
       while (c_1 > 0) {
        a[k++]=1;
        c_1--;
       }
       while (c_2 > 0) {
        a[k++]=2;
        c_2--;
       }
    }

    static void swap(int a[],int st,int end){
        int temp=a[st];
        a[st]=a[end];
        a[end]=temp;
    }

    static void specificSort2(int a[]){
        int l=0,m=0,h=a.length-1;
        while (m<=h) {
            if (a[m] == 0) {
                swap(a, m, l);
                l++;
                m++;
            }
            else if (a[m] == 1) {
                m++;
            }
            else if (a[m] ==2) {
                swap(a, m, h);
                h--;
            }
        }



    }


    public static void main(String[] args) {
        int a[] = {0,2,1,0,2,1};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        specificSort2(a);
        print(a);
    }
}
