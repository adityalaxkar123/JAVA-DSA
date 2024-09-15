package recursion;
import java.util.Scanner;
public class recursion5{

static int sumofNum(int n){

if(n>=0 && n<=9){
return n;
}

else{
    return n%10 + sumofNum(n/10);
}
}
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number");
   int n=sc.nextInt();
   int s=sumofNum(n);
   if(s == 1 || s==2 || s==3 || s==4 || s==5 || s==6 || s==7 || s==8 || s==9 || s==0){
    System.out.println(s);
   }
   else{
    System.out.println(sumofNum(s));
   } 
    sc.close();
}


}

