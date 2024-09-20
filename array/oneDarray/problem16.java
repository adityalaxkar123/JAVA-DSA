import java.util.Scanner;
public class problem16
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
		int []ans=new int[num];
		int j=0;
        System.out.println("enter the k steps");
        int k=sc.nextInt();
        k=k%num;
        for(int i=num-k;i<num;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<num-k;i++){
            ans[j]=arr[i];
            j++;
        }
		System.out.println("the k times reverse array is:");
		for(int i=0;i<=num-1;i++){
		    System.out.print(" "+ans[i]);
		}
		sc.close();
	}
}

