import java.util.Scanner;
public class problem22
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
		int m=num-1;
		int []ans=new int[num];
		while(i<=j){
		    if(Math.abs(arr[i])>Math.abs(arr[j])){
		        ans[m]=arr[i]*arr[i];
		        i++;
		        m--;
		    }
		    else{
		        ans[m]=arr[j]*arr[j];
		        j--;
		        m--;
		    }
		}
		sc.close();
		for(int k=0;k<num;k++){
		    System.out.print(ans[k]+" ");
		}
	}
}
