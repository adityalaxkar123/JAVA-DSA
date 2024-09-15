package recursion;
import java.util.Scanner;
public class recursion8 {


static int sumOfNum(int n){
if(n==1){
    return n;
}
else{
    return n + sumOfNum(n - 1);
}


}



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sumOfNum(n));
        sc.close();
    }
}
