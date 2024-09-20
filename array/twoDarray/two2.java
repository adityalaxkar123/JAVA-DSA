import java.util.Scanner;
public class two2
{
    static int[][] transposeMatrix(int [][] arr,int r,int c){
        int arr_2[][]=new int[c][r];
        for(int i=0;i<c;i++){
		        for(int j=0;j<r;j++){
		            arr_2[i][j]=arr[j][i];
		    }
		}
        return arr_2;
    }
    
    static void transposeInPlace(int[][] arr,int r,int c){
         for(int i=0;i<c;i++){
		        for(int j=i;j<r;j++){
		           int temp=arr[i][j];
		            arr[i][j]=arr[j][i];
		            arr[j][i]=temp;
		    }
		}
    
    }
    
    
    static void print2DArray(int[][] arr){
        	for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
    }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]arr=new int[r][c];
		System.out.println("Enter the element of array");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		  transposeInPlace(arr,r,c);
		  System.out.println("transpose of matrix is:");
		  print2DArray(arr);
	sc.close();
	}
}

