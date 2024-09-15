package binarysearch;

public class bque1 {

    static int findFirstOccurence(int a[],int target){

        int st = 0;
        int n = a.length;
        int end = n - 1;
        int fo=-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if (a[mid] == target) {
                fo=mid;
                /*end = mid - 1;*//*first index*/
                /*st = mid + 1;*/ /*last index*/
            }
            else if (a[mid]<target) {
                st = mid + 1;
            }
            else if (a[mid] > target) {
                end = mid - 1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int a[]={1,1,2,3,4,4,5};
        System.out.println(findFirstOccurence(a, 4));
    }
}
