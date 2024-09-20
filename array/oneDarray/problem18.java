import java.util.Scanner;
public class problem18
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
		System.out.println("Enter the number of query");
		int q=sc.nextInt();
		int []freq=new int[100005];
		for(int i=0;i<num;i++){
		    freq[arr[i]]++;
		}
		while(q>0){
		    System.out.println("Enter the number to be searched");
		    int x=sc.nextInt();
		   if(freq[x]>0){
		       System.out.println("yes");
		   }
		   else{
		       System.out.println("no");
		   }
		    q--;
		}
		sc.close();
	}
}

