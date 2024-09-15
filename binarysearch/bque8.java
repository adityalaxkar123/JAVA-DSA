package binarysearch;

public class bque8 {

    static boolean isDivisionPossible(int a[],int m ,int mid){
        int numberOfChocolate = 1;
        int Choco = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mid) return false;
            if(Choco + a[i] <= mid ) Choco+=a[i];
            else{
                numberOfChocolate++;
                Choco=a[i];
            }
        }
        if (numberOfChocolate <= m) return true;

        return false;
    }

    static int ChocolateDistribution(int a[],int m){
        int n=a.length;
        int ans=0,st = 1,end = (int)1e9;
        if (n<m) return -1; 
        while (st<=end) {
            int mid = st + (end - st)/2;
            if (isDivisionPossible(a,m,mid)) {
                ans=mid;
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {12,34,67,90};
        System.out.println(ChocolateDistribution(a, 2));
    }
}
