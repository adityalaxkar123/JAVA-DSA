package recursion;
import java.util.Scanner;
public class recursion1 {

static void printNumber(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    else{
        printNumber(n-1);
        System.out.println(n);
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        printNumber(n);
        sc.close();

    }
}
