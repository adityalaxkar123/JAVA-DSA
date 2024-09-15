package sorting;

public class sorting3 {

    static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    static void linearSort(int a[]){
        int x=-1;
        int y=-1;
        if (a.length == 1) {
            return;
        }
        for (int i = 1; i < a.length; i++) {
            if(x == -1){
            if (a[i - 1] >a[i]) {
                x = i - 1;
                y = i;
            }
        }
        else{
            if (a[i - 1] >a[i]) {
                y = i;
            }
        }
        }
        int temp =a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    public static void main(String[] args) {
        int a[]={10,5,6,7,8,9,3};
        System.out.println("imput array");
        print(a);
        System.out.println("output array");
        linearSort(a);
        print(a);
      
    }
}