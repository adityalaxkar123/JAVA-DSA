import java.util.Scanner;
public class two6
{
    
     static void print2DArray(int[][] arr){
        	for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
    }
    
    
    static int[][] spiralOrder1(int n){
        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int count=1;
        int arr[][]=new int[n][n];
        while(count<=n*n){
        
        //toprow, from leftcolumn to right column
        for(int j=leftcol;j<=rightcol&& count<=n*n;j++){
            arr[toprow][j]=count++;
        }
        toprow++;
        //rightcol,form toprow to bottomrow
        for(int i=toprow;i<=bottomrow && count<=n*n;i++){
        arr[i][rightcol]=count++;
        }
        rightcol--;
        //bottom row, from rightcol to leftcol
        for(int j=rightcol;j>=leftcol && count<=n*n;j--){
            arr[bottomrow][j]=count++;
        }
        bottomrow--;
        //leftcol,from bottomrow to top row
        for(int i=bottomrow;i>=toprow &&count<=n*n;i--){
            arr[i][leftcol]=count++;
        }
        leftcol++;
        }
        return arr;
    }
    
    
    
    
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the n ");
	     int n=sc.nextInt();
         int arr[][]=spiralOrder1(n);
         print2DArray(arr);
         sc.close();
	}
}