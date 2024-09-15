package binarysearch;
public class bque6 {


    /*approach 1 using mid */
    static boolean binarySearch2D(int a[][],int target){
    int st = 0;
    int r=a.length;
    int c=a[0].length;
    int end = r*c - 1;
    while (st<=end) {
        int mid = st + (end - st)/2;
        int midEle = a[mid/c][mid%c];
        if (midEle == target) return true;
        else if (midEle > target) {
            end = mid - 1;
        }
        else{
            st = mid + 1;
        }
    }

    return false;
    }

    /*approach 2 using zig zag pattern which is both sorted from row nad column */
    static boolean searchMatrix(int[][] a, int target) {
        int r=a.length,c=a[0].length, i = 0 ,j = c - 1;
        while(i<r && j>=0){
            if(a[i][j] == target) return true;
            else if(a[i][j] > target) j--;//target is less than element  then we have to move lesser column side
            else i++;//target is greater than element then we have to move lesser row side side
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(binarySearch2D(a,24));
    }
}
