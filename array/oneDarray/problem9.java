import java.util.Scanner;
public class problem9
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
		int count=0;
		System.out.println("Enter the sum of duplet");
		int num_1=sc.nextInt();
		for(int i=0;i<num;i++){
		    for(int j=i+1;j<num;j++){
		        if(arr[i]+arr[j]==num_1){
		            count++;
		        }
		    }
		}
		System.out.println(count);
		sc.close();
	}
}

