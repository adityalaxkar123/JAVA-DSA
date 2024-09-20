import java.util.Scanner;
public class problem8
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
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<num;i++){
		    if(arr[i]<min){
		        min=arr[i];
		    }
		    else if(arr[i]>max){
		        max=arr[i];
		    }
		}
		int []ans=new int[2];
		ans[0]=min;
		ans[1]=max;
		System.out.println("maximum value is: "+ans[1]);
		System.out.println("minimum value is: "+ans[0]);
		sc.close();
	}
}

