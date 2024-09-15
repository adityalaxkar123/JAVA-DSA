package recursion;
import java.util.Scanner;
public class recursion7 {


static void multiply(int n, int m){
if(m==0){
    return;
}
else{
    multiply(n, m - 1);
    System.out.println(n*m);
}
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the nth times");
        int m=sc.nextInt();
        multiply(n,m);
        sc.close();
    }
}
