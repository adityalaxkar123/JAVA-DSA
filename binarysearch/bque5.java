package binarysearch;

public class bque5 {

    static boolean findDuplicateTarget(int a[],int target){
        int n=a.length;
        int st=0,end=n - 1;
        while (st<=end) {
            int mid = st + (end - st)/2;
            if (a[mid] == target) return true;
            if (a[mid] == a[st] && a[mid] == a[end]) {
                st++;
                end--;
            }
            else if (a[mid]<=a[end]) {
                //mid to end sorted
                if (target >a[mid] && target <= a[end]) {
                    st = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else {
                if (target < a[mid] && target >= a[st]) {
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
        }
        return false;
    }

public static void main(String[] args) {
    int a[]={1,1,1,2,3,3,3,1,1,1};
    System.out.println(findDuplicateTarget(a,4));
}    
}
