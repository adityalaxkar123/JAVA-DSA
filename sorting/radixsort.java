package sorting;

public class radixsort {

    static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    static int mx(int a[]){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>ans) {
                ans=a[i];
            }          
        }
        return ans;
    }

    static void countSorting2(int a[],int place){
        int n = a.length;
        int output[]=new int[n]; 
        int freq[]=new int[10];
        for (int i = 0; i < n; i++) {
            freq[(a[i]/place)%10]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i]=freq[i]+freq[i - 1];
        }
       
        for (int i = n - 1; i >=0; i--) {
            int j = freq[(a[i]/place)%10] - 1;
            output[j]=a[i];
            freq[(a[i]/place)%10]--;
        }
        for (int i = 0; i < n; i++) {
            a[i]=output[i];
        }
    }

    /*8 3 2 4 1*/
    /*1's place */
    /*0 1 1 1 1 0 0 0 1*/
    /*0 1 2 3 4 5 6 7 8*/
    /*0 1 2 3 4 4 4 4 5*/
    /*1 2 3 4 8*/


    /*170 045 075 090 802 002*/
    /*1's place */
    /*2 0 2 0 0 2 0 0 0 0*/
    /*0 1 2 3 4 5 6 7 8 9*/
    /*2 2 4 4 4 6 6 6 6 6*/
    /*170 090 802 002 045 075*/
    /*10's place*/
    /*2 0 0 0 1 0 0 2 0 1*/
    /*0 1 2 3 4 5 6 7 8 9*/
    /*2 2 2 2 3 3 3 5 5 6*/
    /*802 002 170 045 075 090*/
    /*100's place*/
    /*4 1 0 0 0 0 0 0 1 0*/
    /*0 1 2 3 4 5 6 7 8 9*/
    /*4 5 5 5 5 5 5 5 6 6*/
    /* 002 045 075 090 170 802*/
        static void radixSort(int []a){
            int max = mx(a);
            for (int place = 1; max/place > 0; place*=10) {
                countSorting2(a, place);
            }
        }

    public static void main(String[] args) {
        int a[]={170,45,75,90,802,002};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        radixSort(a);
        print(a);
    }
}