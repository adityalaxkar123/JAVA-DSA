import java.util.Scanner;
public class two5
{
    
     static void print2DArray(int[][] arr){
        	for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
    }
    
    
    static void spiralOrder(int arr[][],int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int count=0;
        while(count<r*c){
        
        //toprow, from leftcolumn to right column
        for(int j=leftcol;j<=rightcol&& count<r*c;j++){
            System.out.print(arr[toprow][j]+" ");
            count++;
        }
        toprow++;
        //rightcol,form toprow to bottomrow
        for(int i=toprow;i<=bottomrow && count<r*c;i++){
            System.out.print(arr[i][rightcol]+" ");
            count++;
        }
        rightcol--;
        //bottom row, from rightcol to leftcol
        for(int j=rightcol;j>=leftcol && count<r*c;j--){
            System.out.print(arr[bottomrow][j]+" ");
            count++;
        }
        bottomrow--;
        //leftcol,from bottomrow to top row
        for(int i=bottomrow;i>=toprow &&count<r*c;i--){
            System.out.print(arr[i][leftcol]+" ");
            count++;
        }
        leftcol++;
        }
        return;
    }
    
    
    
    
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the row and column respectively");
	     int r=sc.nextInt();
	     int c=sc.nextInt();
         int arr[][]=new int[r][c];
         System.out.println("Enter the r*c element");
         for(int i=0;i<r;i++){
             for(int j=0;j<c;j++){
                 arr[i][j]=sc.nextInt();
             }
         }         
	   System.out.println("input matrix");
	   print2DArray(arr);
	   System.out.println("spiral order is");
	   spiralOrder(arr,r,c);
	     
	     sc.close();
	     
	}
}

