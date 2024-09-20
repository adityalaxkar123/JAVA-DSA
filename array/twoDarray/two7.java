import java.util.Scanner;
public class two7
{
     static void print2DArray(int[][] arr){
        	for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
}

static int findSumOfRectangle(int arr[][],int l1,int l2,int r1,int r2){
    int sum=0;
    for(int i=l1;i<=l2;i++){
        for(int j=r1;j<=r2;j++){
            sum+=arr[i][j];
        }
    }
    return sum;
}
	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the row and column");
      int r=sc.nextInt();
      int c=sc.nextInt();
      int arr[][]=new int[r][c];
      System.out.println("Enter the r*c element");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       System.out.println("Enter the coordinates respectively");
       int l1=sc.nextInt();
       int r1=sc.nextInt();
       int l2=sc.nextInt();
       int r2=sc.nextInt();
       System.out.println("input array");
       print2DArray(arr);
       System.out.println("the sum of rectangle is:"+findSumOfRectangle(arr,l1,l2,r1,r2));
       
       
       sc.close();
	}
}

