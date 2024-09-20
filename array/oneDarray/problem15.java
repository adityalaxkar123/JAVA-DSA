import java.util.Scanner;
public class problem15
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
		int temp;
		int j=num-1;
		for(int i=0;i<j;i++){
		    temp=arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		    j--;
		}
		System.out.println("the reverse array is:");
		for(int i=0;i<=num-1;i++){
		    System.out.print(" "+arr[i]);
		}
		sc.close();
	}
}
