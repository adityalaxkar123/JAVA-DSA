import java.util.Scanner;
public class problem23
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the element of array");
		for(int j=0;j<=num-1;j++){
		    arr[j]=sc.nextInt();
		}
		
		
		for(int i=1;i<num;i++){
		    arr[i]=arr[i-1]+arr[i];
		}
		
		System.out.println("the prefix sum array is:");
		for(int k=0;k<num;k++){
		    System.out.print(arr[k]+" ");
		}
		sc.close();
	}
}

