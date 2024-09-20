import java.util.Scanner;
public class problem21
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
		int j=num-1;
		int i=0;
		int temp;
		while(i<j){
		    if(arr[i]%2==1&&arr[j]%2==0){
		        temp=arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        i++;
		        j--;
		    }
		    if(arr[i]%2==0){
		        i++;
		    }
		    if(arr[j]%2==1){
		        j--;
		    }
		}
		for(int k=0;k<num;k++){
		    System.out.print(arr[k]+" ");
		}
		sc.close();
	}
}
