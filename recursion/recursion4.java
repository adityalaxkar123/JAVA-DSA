package recursion;

import java.util.Scanner;

public class recursion4 {



static int fibo(int n){
    if (n == 0) {
        return 0;
    }
    else if(n == 1){
        return 1;
    }
    else{
        return fibo(n - 2)  + fibo(n - 1);
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }
}
