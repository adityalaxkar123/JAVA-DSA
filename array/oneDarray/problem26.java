import java.util.Scanner;
public class problem26
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the element of array");
		for(int j=0;j<num;j++){
		    arr[j]=sc.nextInt();
		}
		for(int i=num-2;i>=0;i--){
		    arr[i]=arr[i+1]+arr[i];
		}
		System.out.println("the suffix sum array is:");
		for(int i=0;i<num;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}