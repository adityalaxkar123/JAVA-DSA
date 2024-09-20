import java.util.Scanner;
public class problem12
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
		int max=Integer.MIN_VALUE;
		for(int i=0;i<num;i++){
		    if(arr[i]>max){
		        max=arr[i]; 
		    }
		}
		for(int i=0;i<num;i++){
		    if(arr[i]==max){
		        arr[i]=Integer.MIN_VALUE;
		    }
		}
		int max_1=Integer.MIN_VALUE;
		for(int i=0;i<num;i++){
		    if(arr[i]>max_1){
		        max_1=arr[i];
		    }
		}
		System.out.println(max_1);
		sc.close();
	}
}
