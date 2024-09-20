import java.util.Scanner;
public class problem20
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
		int count_0=0;
		for(int i=0;i<num;i++){
		    if(arr[i]==0){
		        count_0++;
		    }
		    
		}
		for(int i=0;i<count_0;i++){
		    arr[i]=0;
		}
		for(int i=count_0;i<num;i++){
		    arr[i]=1;
		}
		for(int k=0;k<num;k++){
		    System.out.print(arr[k]+" ");
		}
		sc.close();
	}
}