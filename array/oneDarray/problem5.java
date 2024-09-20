import java.util.Scanner;
public class problem5
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		int num_1=0;
		int []arr={5,6,5,3,5,4};
		for(int i=0;i<=5;i++){
		    if(num==arr[i]){
		        num_1=i;
		    }
		    
		}
		System.out.println("the last occuring of "+num+  " is " +num_1+ " place of array");
		sc.close();
	}
}
