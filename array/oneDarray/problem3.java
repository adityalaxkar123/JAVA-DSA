import java.util.Scanner;
public class problem3 {
public static void main(String[] args) {
    int []arr={1,5,3};
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int ans=0;
    for(int i=0;i<3;i++){
        if(num==arr[i]){
            ans=i;
            break;
        }
    }
System.out.println(ans);
sc.close();                                        
}    
}
