package binarysearch;

public class bque4 {

    static boolean findTarget(int a[],int target){

        int n=a.length;
        int st=0,end=n - 1;
        while (st<=end) {
            int mid = st + (end - st)/2;
            if (a[mid] == target) return true;
            if (a[mid] < a[end]) {
                //mid to end sorted
                if (target > a[mid] && target <=a[end]) {
                    st = mid + 1;
                }
                else{
                    end = mid - 1; 
                }
            }
            else{
                //st to mid sorted
                if(target <a[mid] && target >=a[st]){
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
        int a[] = {5,6,7,8,9,1,2,3,4};
        System.out.println(findTarget(a,2));
    }
}
