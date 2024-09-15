package recursion;
import java.util.Scanner;
public class recursion9 {

static int sumOfSeries(int n){//1-2+3-4+5...
if(n==1)
    return 1;

if(n%2==0)
    return sumOfSeries(n-1) - n;

else
    return sumOfSeries(n-1) + n;

}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data");
        int n=sc.nextInt();
        System.out.println(sumOfSeries(n));
        sc.close();;
    }
}
/*method 2 without any recursion using formula n^2 - (m^2 + m)
 if odd then n=m+1
if even then n=m
 */