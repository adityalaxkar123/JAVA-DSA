import java.util.Scanner;
public class problem6
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int num_1=0;
		int []arr=new int[num];
		System.out.println("Enter the element of array");
		for(int j=0;j<=num-1;j++){
		    arr[j]=sc.nextInt();
		}
		System.out.println("Enter the number");
		int num_2=sc.nextInt();
		for(int i=0;i<=num-1;i++){
		    if(arr[i]>num){
		        num_1++;
		    }
		    
		}
		System.out.println("the number of element strictly greater than "+num_2+" is "+num_1+"");
		sc.close();
		
	}
}