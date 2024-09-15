package binarysearch;

public class bque2 {

    static int findRoot(int x){

        int st=0;
        int end = x;
        int ans =-1;
        while (st<=end) {
            int mid = st + (end - st)/2;
            int val =mid*mid;
            if (val == x) {
                return mid;
            }
            else if (val > x) {
                end = mid - 1;
            }
            else{
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findRoot(25));
    }
}
