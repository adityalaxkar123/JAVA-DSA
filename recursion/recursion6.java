package recursion;
import java.util.Scanner;
public class recursion6 {


/*static int power(int n,int m){

if(m==0){
    return 1;
}
else{
    return n*power(n, m - 1);
}
}*/

static int power(int n,int m){
    if(m==0){
        return 1;
    }



    if (m%2==0){
    int ans=power(n,m/2);
    return ans*ans;
    }
    else{
        int ans=power(n,m/2);
        return n*ans*ans;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int m=sc.nextInt();
        System.out.println(power(n,m));
        sc.close();
    }
}

/*static int power(int n,int m){
if(q==0)
return 1;
elseif(q%2==0){
int ans=power(p,q/2);
return ans*ans;
}
else{
int ans=power(p,q/2);
return p*ans*ans;
}

}*/