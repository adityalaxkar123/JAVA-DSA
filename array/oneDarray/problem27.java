import java.util.Scanner;
public class problem27
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column of array respectively");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]a=new int[r][c];
	    System.out.println("Enter the r*c element of array");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("the original array is:");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
		sc.close();
	}
}
