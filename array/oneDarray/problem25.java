import java.util.Scanner;
public class problem25
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the element of array");
		for(int j=0;j<num;j++){
		    arr[j]=sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<num;i++){
		    sum+=arr[i];
		}
		int prefSum=0;
		int count=0;
		for(int i=1;i<num;i++){
		    prefSum+=arr[i];
		    int suffixSum=sum-prefSum;
		    if (suffixSum==prefSum){
		        count=1;
		    } 
		}
		if(count==0){
		    System.out.println("false");
		}
		else{
		    System.out.println("true");
		}
		sc.close();
	}
}