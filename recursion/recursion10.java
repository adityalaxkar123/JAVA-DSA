package recursion;
import java.util.Scanner;
public class recursion10 {



/*static int icommonGretest(int n,int m){
while(n%m!=0){
int num=n%m;
n=m;
m=num;
}
return m;
}*/

static int ecommonGretest(int n,int m){
if( m==0){
    return n;
}
else{
    return ecommonGretest(m, n%m);
}
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n=sc.nextInt();
        System.out.println("Enter second number");
        int m=sc.nextInt();
        //System.out.println(icommonGretest(n,m));
        System.out.println(ecommonGretest(n, m));
        sc.close();
    }
}
