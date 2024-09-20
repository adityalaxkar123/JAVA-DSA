import java.util.Scanner;
public class problem11
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
		for(int i=0;i<num;i++){
		    for(int j=i+1;j<num;j++){
		        if(arr[i]==arr[j]){
		            arr[i]=-1;
		            arr[j]=-1;
		        }
		    }
		}
		for(int i=0;i<num;i++){
		    if(arr[i]>0){
		        System.out.println(arr[i]);
		    }
		}
		sc.close();
	}
}

