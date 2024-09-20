import java.util.Scanner;
public class problem24
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int []arr=new int[num+1];
		System.out.println("Enter the element of array");
		for(int j=1;j<=num;j++){
		    arr[j]=sc.nextInt();
		}
		for(int i=1;i<num+1;i++){
		    arr[i]=arr[i-1]+arr[i];
		}
		System.out.println("Enter the number of queries");
		int q=sc.nextInt();
		int sum=0;
		while(q>0){
		System.out.println("Enter the value of l and r");
		int l=sc.nextInt();
		int r=sc.nextInt();  
		sum=arr[r]-arr[l-1];
		System.out.println("the sum is:"+sum);
		    q--;
		}
			for(int k=1;k<=num;k++){
		    System.out.print(arr[k]+" ");
		} 
		
		
		sc.close();
	}
}

