package binarysearch;

public class bque3 {

    static int rotatedSortedMin(int a[]){
        int n=a.length;
        int st=0,end=n - 1;
        int ans = -1;
        while (st<=end) {
            int mid = st + (end - st)/2;
            if (a[mid] > a[n - 1]) {
                st = mid + 1;                
            }
            else if (a[mid]<a[n - 1]) {
                ans=mid;
                end = mid - 1;
            }
        }

return ans;
    }


    public static void main(String[] args) {
        int a[] = {5,6,7,8,9,1,2,3,4};
        System.out.println(rotatedSortedMin(a));
    }
}
