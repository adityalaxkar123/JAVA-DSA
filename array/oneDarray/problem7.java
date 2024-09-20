import java.util.Scanner;
public class problem7
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
		int num_3=0;
		for(int i=1;i<arr.length;i++){
		 if(arr[i]<arr[i-1]){
		     num_3=1;
		     break;
		 }    
		}
		if(num_3==1){
		    System.out.println("array is not sorted");
		}
		else{
		    System.out.println("array is sorted");
		}
		sc.close();
	}
}
