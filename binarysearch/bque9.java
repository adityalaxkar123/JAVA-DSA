package binarysearch;

public class bque9 {

    static boolean isPossibleDistance(int a[],int m,int mid){
        int kidsPlaced = 1;
        int lastPlace=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] - lastPlace >= mid) {
                kidsPlaced++;
                lastPlace=a[i];
            }
            
            if (kidsPlaced == m) return true;
        }
        return false;
    }

    static int raceTrack(int a[],int m){
        int n=a.length;
        int ans = -1,st=1,end=(int)1e9;
        if(m > n) return -1;
        while (st<=end) {
           int mid = st + (end - st)/2;
           if (isPossibleDistance(a,m,mid)){
            ans=mid;
            st = mid + 1;
           }
           else{
            end = mid - 1;
           }
        }

return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,4,8,9};
        System.out.println(raceTrack(a, 3));
    }
}
