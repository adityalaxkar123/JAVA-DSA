import java.util.Scanner;
public class two8
{
     static void print2DArray(int[][] arr){
        	for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
}

static int findSumOfRectangle1(int arr[][],int l1,int l2,int r1,int r2){
    int sum=0;
    for(int i=l1;i<=l2;i++){
        for(int j=r1;j<=r2;j++){
            sum+=arr[i][j];
        }
    }
    return sum;
}
static int findSumOfRectangle2(int arr[][],int l1,int l2,int r1,int r2){
    int sum=0;
    prefixSum(arr);
    for(int i=l1;i<=l2;i++){
        sum+=arr[i][r2]-arr[i][r1-1];
    }
    return sum;
}

static void prefixSum(int arr[][]){
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr[i].length;j++){
            arr[i][j]+=arr[i][j-1];
        }
    }
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
       System.out.println("the sum of rectangle is:"+findSumOfRectangle1(arr,l1,l2,r1,r2));
       System.out.println("the sum of rectangle is:"+findSumOfRectangle2(arr,l1,l2,r1,r2));
       
       
       sc.close();
	}
}

