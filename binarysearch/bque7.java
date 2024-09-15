package binarysearch;

public class bque7 {
/* peak index of mountain*/
static int peakIndexInMountainArray(int[] a) {
    int n= a.length;
    int st = 0 , end = n - 1,ans=-1;
    while(st<=end){
        int mid = st + (end - st)/2;
        if(a[mid] > a[mid + 1])  end = mid - 1;
        else if(a[mid]<a[mid + 1]){ 
            st = mid + 1;
            ans=mid + 1;
        }
    }
    return ans;
}


    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        System.out.println(peakIndexInMountainArray(a));
    }
    
}
