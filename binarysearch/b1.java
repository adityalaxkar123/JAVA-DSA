package binarysearch;

public class b1 {

    static void print(int a[]){
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }

    static boolean findTarget(int a[],int target){
      int n = a.length;
      int st = 0,end = n - 1;
       while (st<=end) {
        int mid = st + (end - st)/2;
        //int mid = (st + end)/2;
        if (target == a[mid]) {
            return true;
        }
        else if (target < a[mid]) {
            end = mid - 1;
        }
        else if (target > a[mid]) {
            st = mid + 1;
        }
       } 
       return false;
       
    }

    static boolean recBs(int a[],int st,int end,int target){
        if(st>end)return false;
        int mid = st + (end - st)/2;
        //int mid =(st + end)/2;
        if (a[mid] == target) {
            return true;
        }
        else if (a[mid] >target) {
            return recBs(a, st, mid -1, target);
        }
        else{
            return recBs(a,mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        /*int a[] = {2,4,5,7,15,20,24,45,50,77};*/
        /*System.out.println("input array");
        print(a);
        System.out.println("output array");*/
        int a[] = {1,2,3,4,5};
        int target = 2;
      System.out.println(recBs(a, 0, a.length - 1, target));  
      
       /* while (target!=10) {
            /*System.out.printf("%d is exists in arr: %b\n",target,findTarget(a,target));*/
            /*System.out.printf("%d is exists in arr: %b\n",target,recBs(a, 0, a.length - 1, target));
            target++;
        }*/
    }
}