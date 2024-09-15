package sorting;
public class countsorting {

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

    /*8 3 2 4 1*/
    /* 0 1 1 1 1 0 0 0 1*/
    /* 0 1 2 3 4 5 6 7 8*/
    /*1 2 3 4 8*/
    /*not inplace*/
    static void countSorting1(int a[]){
        int max = mx(a);
        int freq[]=new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;
        }
        int k=0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                a[k++]=i;
            }
        }
        

    }

    /*8 3 2 4 1*/
    /*0 1 1 1 1 0 0 0 1*/
    /*0 1 2 3 4 5 6 7 8*/
    /*0 1 2 3 4 4 4 4 5*/
    /* 1 2 3 4 8*/
    /*inplace*/
    static void countSorting2(int a[]){
        int n = a.length;
        int output[]=new int[n]; 
        int max = mx(a);
        int freq[]=new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i]=freq[i]+freq[i - 1];
        }
       
        for (int i = n - 1; i >=0; i--) {
            int j = freq[a[i]] - 1;
            output[j]=a[i];
            freq[a[i]]--;
        }
        for (int i = 0; i < n; i++) {
            a[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int a[] ={4,3,1,5,3,1,3,5};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        countSorting2(a);
        print(a);
   } 
}
