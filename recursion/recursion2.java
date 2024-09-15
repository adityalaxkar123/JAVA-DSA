package recursion;
import java.util.Scanner;
public class recursion2 {

static void printReverse(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    else{
        System.out.println(n);
        printReverse(n-1);
    }


}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        printReverse(n);
        sc.close();
    }
}
