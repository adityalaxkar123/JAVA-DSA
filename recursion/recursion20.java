package recursion;
import java.util.Scanner;
public class recursion20 {


static int frogMin(int h[],int idx){

if (idx == h.length - 1) {
    return 0;
}
int op1 = Math.abs(h[idx] - h[idx + 1]) + frogMin(h, idx + 1);
if (idx == h.length - 2) {
    return op1;
}
int op2 = Math.abs(h[idx] - h[idx + 2]) + frogMin(h, idx + 2);
return Math.min(op1, op2);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h[] = {10,30,40,20};
        int idx=0;
        System.out.println(frogMin(h,idx));
        sc.close();
    }
}
